package org.example.phases;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import static org.apache.maven.plugins.annotations.LifecyclePhase.DEPLOY;

@Mojo( name = "dependency-deploy", defaultPhase = DEPLOY)
public class DeployMojo extends AbstractMojo {

    static String phase = "DEPLOY";

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(phase);

    }
}
