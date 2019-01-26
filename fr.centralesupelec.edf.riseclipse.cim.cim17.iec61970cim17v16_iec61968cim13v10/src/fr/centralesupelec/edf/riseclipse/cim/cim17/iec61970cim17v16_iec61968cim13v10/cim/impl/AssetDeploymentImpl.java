/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetDeployment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerApplicationKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentStateKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FacilityKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerApplicationKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetDeploymentImpl#getBreakerApplication <em>Breaker Application</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetDeploymentImpl#getDeploymentState <em>Deployment State</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetDeploymentImpl#getFacilityKind <em>Facility Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetDeploymentImpl#getLikelihoodOfFailure <em>Likelihood Of Failure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetDeploymentImpl#getTransformerApplication <em>Transformer Application</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetDeploymentImpl#getDeploymentDate <em>Deployment Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetDeploymentImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetDeploymentImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetDeploymentImpl extends IdentifiedObjectImpl implements AssetDeployment {
    /**
     * The default value of the '{@link #getBreakerApplication() <em>Breaker Application</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerApplication()
     * @generated
     * @ordered
     */
    protected static final BreakerApplicationKind BREAKER_APPLICATION_EDEFAULT = BreakerApplicationKind.CAPACITOR_OR_REACTOR_BANK_BREAKER;

    /**
     * The cached value of the '{@link #getBreakerApplication() <em>Breaker Application</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerApplication()
     * @generated
     * @ordered
     */
    protected BreakerApplicationKind breakerApplication = BREAKER_APPLICATION_EDEFAULT;

    /**
     * This is true if the Breaker Application attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean breakerApplicationESet;

    /**
     * The default value of the '{@link #getDeploymentState() <em>Deployment State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeploymentState()
     * @generated
     * @ordered
     */
    protected static final DeploymentStateKind DEPLOYMENT_STATE_EDEFAULT = DeploymentStateKind.NOT_YET_INSTALLED;

    /**
     * The cached value of the '{@link #getDeploymentState() <em>Deployment State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeploymentState()
     * @generated
     * @ordered
     */
    protected DeploymentStateKind deploymentState = DEPLOYMENT_STATE_EDEFAULT;

    /**
     * This is true if the Deployment State attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deploymentStateESet;

    /**
     * The default value of the '{@link #getFacilityKind() <em>Facility Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFacilityKind()
     * @generated
     * @ordered
     */
    protected static final FacilityKind FACILITY_KIND_EDEFAULT = FacilityKind.SUBSTATION_HYDRO_PLANT;

    /**
     * The cached value of the '{@link #getFacilityKind() <em>Facility Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFacilityKind()
     * @generated
     * @ordered
     */
    protected FacilityKind facilityKind = FACILITY_KIND_EDEFAULT;

    /**
     * This is true if the Facility Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean facilityKindESet;

    /**
     * The default value of the '{@link #getLikelihoodOfFailure() <em>Likelihood Of Failure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLikelihoodOfFailure()
     * @generated
     * @ordered
     */
    protected static final Integer LIKELIHOOD_OF_FAILURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLikelihoodOfFailure() <em>Likelihood Of Failure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLikelihoodOfFailure()
     * @generated
     * @ordered
     */
    protected Integer likelihoodOfFailure = LIKELIHOOD_OF_FAILURE_EDEFAULT;

    /**
     * This is true if the Likelihood Of Failure attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean likelihoodOfFailureESet;

    /**
     * The default value of the '{@link #getTransformerApplication() <em>Transformer Application</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerApplication()
     * @generated
     * @ordered
     */
    protected static final TransformerApplicationKind TRANSFORMER_APPLICATION_EDEFAULT = TransformerApplicationKind.TRANSMISSION_BUS_TO_BUS;

    /**
     * The cached value of the '{@link #getTransformerApplication() <em>Transformer Application</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerApplication()
     * @generated
     * @ordered
     */
    protected TransformerApplicationKind transformerApplication = TRANSFORMER_APPLICATION_EDEFAULT;

    /**
     * This is true if the Transformer Application attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transformerApplicationESet;

    /**
     * The cached value of the '{@link #getDeploymentDate() <em>Deployment Date</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeploymentDate()
     * @generated
     * @ordered
     */
    protected DeploymentDate deploymentDate;

    /**
     * This is true if the Deployment Date containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deploymentDateESet;

    /**
     * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseVoltage()
     * @generated
     * @ordered
     */
    protected BaseVoltage baseVoltage;

    /**
     * This is true if the Base Voltage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseVoltageESet;

    /**
     * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsset()
     * @generated
     * @ordered
     */
    protected Asset asset;

    /**
     * This is true if the Asset reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetDeploymentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAssetDeployment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BreakerApplicationKind getBreakerApplication() {
        return breakerApplication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBreakerApplication( BreakerApplicationKind newBreakerApplication ) {
        BreakerApplicationKind oldBreakerApplication = breakerApplication;
        breakerApplication = newBreakerApplication == null ? BREAKER_APPLICATION_EDEFAULT : newBreakerApplication;
        boolean oldBreakerApplicationESet = breakerApplicationESet;
        breakerApplicationESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_DEPLOYMENT__BREAKER_APPLICATION,
                    oldBreakerApplication, breakerApplication, !oldBreakerApplicationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBreakerApplication() {
        BreakerApplicationKind oldBreakerApplication = breakerApplication;
        boolean oldBreakerApplicationESet = breakerApplicationESet;
        breakerApplication = BREAKER_APPLICATION_EDEFAULT;
        breakerApplicationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET_DEPLOYMENT__BREAKER_APPLICATION,
                    oldBreakerApplication, BREAKER_APPLICATION_EDEFAULT, oldBreakerApplicationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBreakerApplication() {
        return breakerApplicationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DeploymentStateKind getDeploymentState() {
        return deploymentState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDeploymentState( DeploymentStateKind newDeploymentState ) {
        DeploymentStateKind oldDeploymentState = deploymentState;
        deploymentState = newDeploymentState == null ? DEPLOYMENT_STATE_EDEFAULT : newDeploymentState;
        boolean oldDeploymentStateESet = deploymentStateESet;
        deploymentStateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_STATE,
                    oldDeploymentState, deploymentState, !oldDeploymentStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDeploymentState() {
        DeploymentStateKind oldDeploymentState = deploymentState;
        boolean oldDeploymentStateESet = deploymentStateESet;
        deploymentState = DEPLOYMENT_STATE_EDEFAULT;
        deploymentStateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_STATE,
                    oldDeploymentState, DEPLOYMENT_STATE_EDEFAULT, oldDeploymentStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDeploymentState() {
        return deploymentStateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FacilityKind getFacilityKind() {
        return facilityKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFacilityKind( FacilityKind newFacilityKind ) {
        FacilityKind oldFacilityKind = facilityKind;
        facilityKind = newFacilityKind == null ? FACILITY_KIND_EDEFAULT : newFacilityKind;
        boolean oldFacilityKindESet = facilityKindESet;
        facilityKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET_DEPLOYMENT__FACILITY_KIND, oldFacilityKind, facilityKind, !oldFacilityKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFacilityKind() {
        FacilityKind oldFacilityKind = facilityKind;
        boolean oldFacilityKindESet = facilityKindESet;
        facilityKind = FACILITY_KIND_EDEFAULT;
        facilityKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET_DEPLOYMENT__FACILITY_KIND,
                    oldFacilityKind, FACILITY_KIND_EDEFAULT, oldFacilityKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFacilityKind() {
        return facilityKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getLikelihoodOfFailure() {
        return likelihoodOfFailure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLikelihoodOfFailure( Integer newLikelihoodOfFailure ) {
        Integer oldLikelihoodOfFailure = likelihoodOfFailure;
        likelihoodOfFailure = newLikelihoodOfFailure;
        boolean oldLikelihoodOfFailureESet = likelihoodOfFailureESet;
        likelihoodOfFailureESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_DEPLOYMENT__LIKELIHOOD_OF_FAILURE,
                    oldLikelihoodOfFailure, likelihoodOfFailure, !oldLikelihoodOfFailureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLikelihoodOfFailure() {
        Integer oldLikelihoodOfFailure = likelihoodOfFailure;
        boolean oldLikelihoodOfFailureESet = likelihoodOfFailureESet;
        likelihoodOfFailure = LIKELIHOOD_OF_FAILURE_EDEFAULT;
        likelihoodOfFailureESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET_DEPLOYMENT__LIKELIHOOD_OF_FAILURE,
                        oldLikelihoodOfFailure, LIKELIHOOD_OF_FAILURE_EDEFAULT, oldLikelihoodOfFailureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLikelihoodOfFailure() {
        return likelihoodOfFailureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerApplicationKind getTransformerApplication() {
        return transformerApplication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransformerApplication( TransformerApplicationKind newTransformerApplication ) {
        TransformerApplicationKind oldTransformerApplication = transformerApplication;
        transformerApplication = newTransformerApplication == null ? TRANSFORMER_APPLICATION_EDEFAULT
                : newTransformerApplication;
        boolean oldTransformerApplicationESet = transformerApplicationESet;
        transformerApplicationESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_DEPLOYMENT__TRANSFORMER_APPLICATION,
                        oldTransformerApplication, transformerApplication, !oldTransformerApplicationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerApplication() {
        TransformerApplicationKind oldTransformerApplication = transformerApplication;
        boolean oldTransformerApplicationESet = transformerApplicationESet;
        transformerApplication = TRANSFORMER_APPLICATION_EDEFAULT;
        transformerApplicationESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET_DEPLOYMENT__TRANSFORMER_APPLICATION,
                        oldTransformerApplication, TRANSFORMER_APPLICATION_EDEFAULT, oldTransformerApplicationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerApplication() {
        return transformerApplicationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DeploymentDate getDeploymentDate() {
        return deploymentDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDeploymentDate( DeploymentDate newDeploymentDate, NotificationChain msgs ) {
        DeploymentDate oldDeploymentDate = deploymentDate;
        deploymentDate = newDeploymentDate;
        boolean oldDeploymentDateESet = deploymentDateESet;
        deploymentDateESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE, oldDeploymentDate, newDeploymentDate,
                    !oldDeploymentDateESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDeploymentDate( DeploymentDate newDeploymentDate ) {
        if( newDeploymentDate != deploymentDate ) {
            NotificationChain msgs = null;
            if( deploymentDate != null ) msgs = ( ( InternalEObject ) deploymentDate ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE, null, msgs );
            if( newDeploymentDate != null ) msgs = ( ( InternalEObject ) newDeploymentDate ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE, null, msgs );
            msgs = basicSetDeploymentDate( newDeploymentDate, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDeploymentDateESet = deploymentDateESet;
            deploymentDateESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE,
                        newDeploymentDate, newDeploymentDate, !oldDeploymentDateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDeploymentDate( NotificationChain msgs ) {
        DeploymentDate oldDeploymentDate = deploymentDate;
        deploymentDate = null;
        boolean oldDeploymentDateESet = deploymentDateESet;
        deploymentDateESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE, oldDeploymentDate, null, oldDeploymentDateESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDeploymentDate() {
        if( deploymentDate != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) deploymentDate ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE, null, msgs );
            msgs = basicUnsetDeploymentDate( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDeploymentDateESet = deploymentDateESet;
            deploymentDateESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE, null, null, oldDeploymentDateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDeploymentDate() {
        return deploymentDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseVoltage getBaseVoltage() {
        return baseVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseVoltage( BaseVoltage newBaseVoltage, NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = newBaseVoltage;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_DEPLOYMENT__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage, !oldBaseVoltageESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseVoltage( BaseVoltage newBaseVoltage ) {
        if( newBaseVoltage != baseVoltage ) {
            NotificationChain msgs = null;
            if( baseVoltage != null ) msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__NETWORK_ASSET_DEPLOYMENT, BaseVoltage.class, msgs );
            if( newBaseVoltage != null ) msgs = ( ( InternalEObject ) newBaseVoltage ).eInverseAdd( this,
                    CimPackage.BASE_VOLTAGE__NETWORK_ASSET_DEPLOYMENT, BaseVoltage.class, msgs );
            msgs = basicSetBaseVoltage( newBaseVoltage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_DEPLOYMENT__BASE_VOLTAGE, newBaseVoltage, newBaseVoltage, !oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBaseVoltage( NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = null;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_DEPLOYMENT__BASE_VOLTAGE, oldBaseVoltage, null, oldBaseVoltageESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBaseVoltage() {
        if( baseVoltage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__NETWORK_ASSET_DEPLOYMENT, BaseVoltage.class, msgs );
            msgs = basicUnsetBaseVoltage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_DEPLOYMENT__BASE_VOLTAGE, null, null, oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaseVoltage() {
        return baseVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Asset getAsset() {
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsset( Asset newAsset, NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = newAsset;
        boolean oldAssetESet = assetESet;
        assetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_DEPLOYMENT__ASSET, oldAsset, newAsset, !oldAssetESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAsset( Asset newAsset ) {
        if( newAsset != asset ) {
            NotificationChain msgs = null;
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__ASSET_DEPLOYMENT, Asset.class, msgs );
            if( newAsset != null ) msgs = ( ( InternalEObject ) newAsset ).eInverseAdd( this,
                    CimPackage.ASSET__ASSET_DEPLOYMENT, Asset.class, msgs );
            msgs = basicSetAsset( newAsset, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_DEPLOYMENT__ASSET, newAsset, newAsset, !oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsset( NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = null;
        boolean oldAssetESet = assetESet;
        assetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_DEPLOYMENT__ASSET, oldAsset, null, oldAssetESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAsset() {
        if( asset != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asset ).eInverseRemove( this, CimPackage.ASSET__ASSET_DEPLOYMENT, Asset.class,
                    msgs );
            msgs = basicUnsetAsset( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_DEPLOYMENT__ASSET, null, null, oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsset() {
        return assetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ASSET_DEPLOYMENT__BASE_VOLTAGE:
            if( baseVoltage != null ) msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__NETWORK_ASSET_DEPLOYMENT, BaseVoltage.class, msgs );
            return basicSetBaseVoltage( ( BaseVoltage ) otherEnd, msgs );
        case CimPackage.ASSET_DEPLOYMENT__ASSET:
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__ASSET_DEPLOYMENT, Asset.class, msgs );
            return basicSetAsset( ( Asset ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE:
            return basicUnsetDeploymentDate( msgs );
        case CimPackage.ASSET_DEPLOYMENT__BASE_VOLTAGE:
            return basicUnsetBaseVoltage( msgs );
        case CimPackage.ASSET_DEPLOYMENT__ASSET:
            return basicUnsetAsset( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ASSET_DEPLOYMENT__BREAKER_APPLICATION:
            return getBreakerApplication();
        case CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_STATE:
            return getDeploymentState();
        case CimPackage.ASSET_DEPLOYMENT__FACILITY_KIND:
            return getFacilityKind();
        case CimPackage.ASSET_DEPLOYMENT__LIKELIHOOD_OF_FAILURE:
            return getLikelihoodOfFailure();
        case CimPackage.ASSET_DEPLOYMENT__TRANSFORMER_APPLICATION:
            return getTransformerApplication();
        case CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE:
            return getDeploymentDate();
        case CimPackage.ASSET_DEPLOYMENT__BASE_VOLTAGE:
            return getBaseVoltage();
        case CimPackage.ASSET_DEPLOYMENT__ASSET:
            return getAsset();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.ASSET_DEPLOYMENT__BREAKER_APPLICATION:
            setBreakerApplication( ( BreakerApplicationKind ) newValue );
            return;
        case CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_STATE:
            setDeploymentState( ( DeploymentStateKind ) newValue );
            return;
        case CimPackage.ASSET_DEPLOYMENT__FACILITY_KIND:
            setFacilityKind( ( FacilityKind ) newValue );
            return;
        case CimPackage.ASSET_DEPLOYMENT__LIKELIHOOD_OF_FAILURE:
            setLikelihoodOfFailure( ( Integer ) newValue );
            return;
        case CimPackage.ASSET_DEPLOYMENT__TRANSFORMER_APPLICATION:
            setTransformerApplication( ( TransformerApplicationKind ) newValue );
            return;
        case CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE:
            setDeploymentDate( ( DeploymentDate ) newValue );
            return;
        case CimPackage.ASSET_DEPLOYMENT__BASE_VOLTAGE:
            setBaseVoltage( ( BaseVoltage ) newValue );
            return;
        case CimPackage.ASSET_DEPLOYMENT__ASSET:
            setAsset( ( Asset ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.ASSET_DEPLOYMENT__BREAKER_APPLICATION:
            unsetBreakerApplication();
            return;
        case CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_STATE:
            unsetDeploymentState();
            return;
        case CimPackage.ASSET_DEPLOYMENT__FACILITY_KIND:
            unsetFacilityKind();
            return;
        case CimPackage.ASSET_DEPLOYMENT__LIKELIHOOD_OF_FAILURE:
            unsetLikelihoodOfFailure();
            return;
        case CimPackage.ASSET_DEPLOYMENT__TRANSFORMER_APPLICATION:
            unsetTransformerApplication();
            return;
        case CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE:
            unsetDeploymentDate();
            return;
        case CimPackage.ASSET_DEPLOYMENT__BASE_VOLTAGE:
            unsetBaseVoltage();
            return;
        case CimPackage.ASSET_DEPLOYMENT__ASSET:
            unsetAsset();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.ASSET_DEPLOYMENT__BREAKER_APPLICATION:
            return isSetBreakerApplication();
        case CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_STATE:
            return isSetDeploymentState();
        case CimPackage.ASSET_DEPLOYMENT__FACILITY_KIND:
            return isSetFacilityKind();
        case CimPackage.ASSET_DEPLOYMENT__LIKELIHOOD_OF_FAILURE:
            return isSetLikelihoodOfFailure();
        case CimPackage.ASSET_DEPLOYMENT__TRANSFORMER_APPLICATION:
            return isSetTransformerApplication();
        case CimPackage.ASSET_DEPLOYMENT__DEPLOYMENT_DATE:
            return isSetDeploymentDate();
        case CimPackage.ASSET_DEPLOYMENT__BASE_VOLTAGE:
            return isSetBaseVoltage();
        case CimPackage.ASSET_DEPLOYMENT__ASSET:
            return isSetAsset();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (breakerApplication: " );
        if( breakerApplicationESet )
            result.append( breakerApplication );
        else
            result.append( "<unset>" );
        result.append( ", deploymentState: " );
        if( deploymentStateESet )
            result.append( deploymentState );
        else
            result.append( "<unset>" );
        result.append( ", facilityKind: " );
        if( facilityKindESet )
            result.append( facilityKind );
        else
            result.append( "<unset>" );
        result.append( ", likelihoodOfFailure: " );
        if( likelihoodOfFailureESet )
            result.append( likelihoodOfFailure );
        else
            result.append( "<unset>" );
        result.append( ", transformerApplication: " );
        if( transformerApplicationESet )
            result.append( transformerApplication );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AssetDeploymentImpl
