package org.example.phases;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import static org.apache.maven.plugins.annotations.LifecyclePhase.VERIFY;

@Mojo( name = "dependency-verify", defaultPhase = VERIFY)
public class VerifyMojo extends AbstractMojo {

    static String phase = "VERIFY";

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(phase);
        getPluginContext().put(phase, System.currentTimeMillis());

        long time = System.currentTimeMillis() - (long)getPluginContext().get(PackageMojo.phase);

        getLog().info("time: " + time  + "ms");

    }
}
