package org.example.phases;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.*;
import org.apache.maven.project.MavenProject;

import java.io.File;

import static org.apache.maven.plugins.annotations.LifecyclePhase.CLEAN;

@Mojo( name = "dependency-clean", defaultPhase = CLEAN)
@Execute(phase = CLEAN)
public class CleanMojo extends AbstractMojo {

    @Component
    private MavenProject mavenProject;
    @Parameter(property = "main.class", defaultValue = "${application.class}")
    protected String mainClass;
    @Parameter(defaultValue = "${project.build.outputDirectory}")
    private File output;
    @Parameter(defaultValue = "${project.build.directory}${file.separator}")
    private File assemblyOutput;

    static String phase = "CLEAN";

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(phase);
        getLog().info(mainClass);
        getLog().info(output.getAbsolutePath());
        getLog().info(assemblyOutput.getAbsolutePath());
        try {
            getLog().info(mavenProject.getArtifact().getFile().getAbsolutePath());
        }catch (NullPointerException e ){
            getLog().info("Missing Artifact");
        }
    }
}
