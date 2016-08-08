module.exports = function (grunt) {
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        copy: {
            src: {
                files: [
                    {expand: true, cwd: 'src', src: ['*.html'], dest: 'dist/html'}
                ]
            },
            image: {
                files: [
                    {expand: true, cwd: 'src', src: ['images/*.{png,jpg,jpeg,gif}'], dest: 'dist/html'}
                ]
            }
        },

        // 文件合并
        concat: {
            options: {
                stripBanners: true
            },
            jsPlugins: {
                src: [
                    /* plugins js */
                    /* form */
                    "assets/plugins/bootstrap-tagsinput/dist/bootstrap-tagsinput.min.js",
                    "assets/plugins/switchery/dist/switchery.min.js",
                    "assets/plugins/select2/select2.min.js",
                    "assets/plugins/bootstrap-select/dist/js/bootstrap-select.min.js",
                    "assets/plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.js",
                    "assets/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js",
                    /* Autocomplete */
                    "assets/plugins/autocomplete/jquery.mockjax.js",
                    "assets/plugins/autocomplete/jquery.autocomplete.min.js",
                    /* notify */
                    "assets/plugins/notifyjs/dist/notify.min.js",
                    "assets/plugins/notifications/notify-metro.js",
                    /* bootstrap-table */
                    "assets/plugins/bootstrap-table/bootstrap-table.min.js",
                    "assets/plugins/bootstrap-table/bootstrap-table-zh-CN.min.js",
                    /* notify */
                    "assets/plugins/notifyjs/dist/notify.min.js",
                    "assets/plugins/notifications/notify-metro.js",
                    /* isotope */
                    "assets/plugins/isotope/dist/isotope.pkgd.min.js",
                    /* sweetalert */
                    "assets/plugins/sweetalert/dist/sweetalert.min.js",
                    /*parsleyjs */
                    "assets/plugins/parsleyjs/dist/parsley.min.js",
                    "assets/plugins/parsleyjs/dist/zh_cn.js",
                    "assets/plugins/parsleyjs/dist/zh_cn.extra.js",
                    /* chart */
                    "assets/plugins/peity/jquery.peity.min.js",
                    "assets/plugins/jquery-sparkline/jquery.sparkline.min.js",
                    /*Form Wizard*/
                    "assets/plugins/jquery.steps/build/jquery.steps.min.js",
                ],
                dest: "assets/js/app.plugins.js"
            },
            jsPages: {
                src: [
                    /* pages javascript */
                    "assets/js/detect.js",
                    "assets/js/fastclick.js",
                    "assets/js/jquery.slimscroll.js",
                    "assets/js/jquery.blockUI.js",
                    "assets/js/waves.js",
                    "assets/js/wow.min.js",
                    "assets/js/jquery.nicescroll.js",
                    "assets/js/jquery.scrollTo.min.js",
                    "assets/js/jquery.core.js",
                    "assets/js/jquery.app.js"
                ],
                dest: "assets/js/app.pages.js"
            },

            css: {
                src: [
                    /* plugins style*/
                    "assets/plugins/bootstrap-tagsinput/dist/bootstrap-tagsinput.css",
                    "assets/plugins/switchery/dist/switchery.min.css",
                    "assets/plugins/select2/select2.css",
                    "assets/plugins/bootstrap-select/dist/css/bootstrap-select.min.css",
                    "assets/plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.css",
                    "assets/plugins/bootstrap-table/bootstrap-table.min.css",
                    "assets/plugins/jquery.steps/demo/css/jquery.steps.css",
                    "assets/plugins/sweetalert/dist/sweetalert.css",

                    /* main style*/
                    "assets/css/core.css",
                    "assets/css/components.css",
                    "assets/css/icons.css",
                    "assets/css/pages.css",
                    "assets/css/responsive.css"

                ],
                dest: "assets/css/app.css"
            }
        },

        //压缩JS
        uglify: {
            options: {},
            dist: {
                files: {
                    'assets/js/app.plugins.min.js': 'assets/js/app.plugins.js',
                    'assets/js/app.pages.min.js': 'assets/js/app.pages.js'
                }
            }
        },

        //压缩CSS
        cssmin: {
            options: {
                keepSpecialComments: 0
            },
            compress: {
                files: {
                    'assets/css/app.min.css': [
                        "assets/css/app.css"
                    ]
                }
            }
        },

        //去掉生成的中间文件
        clean: {
            js: ['assets/js/app.plugins.js', 'assets/js/app.pages.js'],
            css: ['assets/css/app.css']
        }

    });


    //载入concat和uglify插件，分别对于合并和压缩
    grunt.loadNpmTasks('grunt-contrib-concat');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-cssmin');
    grunt.loadNpmTasks('grunt-contrib-clean');

    grunt.registerTask('default', ['concat', 'uglify', 'cssmin', 'clean']);
};