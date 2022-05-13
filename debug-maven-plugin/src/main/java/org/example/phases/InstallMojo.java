package org.example.phases;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo( name = "dependency-install", defaultPhase = LifecyclePhase.INSTALL)
public class InstallMojo extends AbstractMojo {

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    private MavenProject mavenProject;
    @Parameter(property = "main.class", defaultValue = "${application.class}")
    protected String mainClass;

    @Parameter
    private String param;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info("INSTALL");
        getLog().info(param);

    }
}
