package org.example.phases;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

import static org.apache.maven.plugins.annotations.LifecyclePhase.VALIDATE;

@Mojo( name = "dependency-validate", defaultPhase = VALIDATE)
public class ValidateMojo extends AbstractMojo {

    static String phase = "VALIDATE";

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(phase);
        getPluginContext().put(phase, System.currentTimeMillis());
    }
}
