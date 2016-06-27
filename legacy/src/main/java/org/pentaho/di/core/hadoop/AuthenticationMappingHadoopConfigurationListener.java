package org.pentaho.di.core.hadoop;

import org.pentaho.di.core.hadoop.HadoopConfigurationListener;
import org.pentaho.hadoop.shim.HadoopConfiguration;

public interface AuthenticationMappingHadoopConfigurationListener extends HadoopConfigurationListener {

    /**
     * Called after onClassLoaderAvailable() and before onConfigurationOpen().
     * <p />
     * Ideal for any HadoopConfiguration validation/checking, as this gets triggered just prior to
     * HadoopConfiguration.getHadoopShim()'s initialization ( i.e. HadoopShim.onLoad() )
     *
     * @param hadoopConfiguration HadoopConfiguration
     */
    void onConfigurationPrepared( HadoopConfiguration hadoopConfiguration );

}
