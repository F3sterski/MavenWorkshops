package org.example.phases;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import java.io.File;

import static org.apache.maven.plugins.annotations.LifecyclePhase.GENERATE_RESOURCES;

@Mojo( name = "dependency-generate-resources", defaultPhase = GENERATE_RESOURCES)
public class GenerateResourcesMojo extends AbstractMojo {

    static String phase = "GENERATE RESOURCES";

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info(phase);

        File f = new File("lib\\mockito-all-2.0.2-beta.jar");
        if(f.exists() && !f.isDirectory()) {
            getLog().info("mockito jar exists");
        }else {
            getLog().info("mockito jar cannot be find");
        }

        getPluginContext().put(phase, System.currentTimeMillis());



    }
}
