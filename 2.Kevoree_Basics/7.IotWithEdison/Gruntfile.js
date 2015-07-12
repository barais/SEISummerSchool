/*global module:false*/
module.exports = function(grunt) {

    // Project configuration.
    grunt.initConfig({
        // Task configuration.
        typescript: {
            base: {
                src: ['examples/src/headstempcomp/**/*.ts'],
                dest: 'gen/src/headstempcomp/lib',
                options: {
                    module: 'commonjs',
                    target: 'es5',
                    basePath: 'examples',
                    declaration: false
                }
            }
        }
    });

    // These plugins provide necessary tasks.
    grunt.loadNpmTasks('grunt-typescript');

    // Default task.
    grunt.registerTask('default', ['typescript']);

};
