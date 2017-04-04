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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Quality61850;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Source;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Validity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality61850</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getBadReference <em>Bad Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getEstimatorReplaced <em>Estimator Replaced</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getFailure <em>Failure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getOldData <em>Old Data</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getOperatorBlocked <em>Operator Blocked</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getOscillatory <em>Oscillatory</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getOutOfRange <em>Out Of Range</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getOverFlow <em>Over Flow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getSuspect <em>Suspect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getTest <em>Test</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Quality61850Impl#getValidity <em>Validity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Quality61850Impl extends CimObjectWithIDImpl implements Quality61850 {
    /**
     * The default value of the '{@link #getBadReference() <em>Bad Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBadReference()
     * @generated
     * @ordered
     */
    protected static final Boolean BAD_REFERENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBadReference() <em>Bad Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBadReference()
     * @generated
     * @ordered
     */
    protected Boolean badReference = BAD_REFERENCE_EDEFAULT;

    /**
     * This is true if the Bad Reference attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean badReferenceESet;

    /**
     * The default value of the '{@link #getEstimatorReplaced() <em>Estimator Replaced</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEstimatorReplaced()
     * @generated
     * @ordered
     */
    protected static final Boolean ESTIMATOR_REPLACED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEstimatorReplaced() <em>Estimator Replaced</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEstimatorReplaced()
     * @generated
     * @ordered
     */
    protected Boolean estimatorReplaced = ESTIMATOR_REPLACED_EDEFAULT;

    /**
     * This is true if the Estimator Replaced attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean estimatorReplacedESet;

    /**
     * The default value of the '{@link #getFailure() <em>Failure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailure()
     * @generated
     * @ordered
     */
    protected static final Boolean FAILURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFailure() <em>Failure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailure()
     * @generated
     * @ordered
     */
    protected Boolean failure = FAILURE_EDEFAULT;

    /**
     * This is true if the Failure attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean failureESet;

    /**
     * The default value of the '{@link #getOldData() <em>Old Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOldData()
     * @generated
     * @ordered
     */
    protected static final Boolean OLD_DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOldData() <em>Old Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOldData()
     * @generated
     * @ordered
     */
    protected Boolean oldData = OLD_DATA_EDEFAULT;

    /**
     * This is true if the Old Data attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oldDataESet;

    /**
     * The default value of the '{@link #getOperatorBlocked() <em>Operator Blocked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatorBlocked()
     * @generated
     * @ordered
     */
    protected static final Boolean OPERATOR_BLOCKED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOperatorBlocked() <em>Operator Blocked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatorBlocked()
     * @generated
     * @ordered
     */
    protected Boolean operatorBlocked = OPERATOR_BLOCKED_EDEFAULT;

    /**
     * This is true if the Operator Blocked attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operatorBlockedESet;

    /**
     * The default value of the '{@link #getOscillatory() <em>Oscillatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOscillatory()
     * @generated
     * @ordered
     */
    protected static final Boolean OSCILLATORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOscillatory() <em>Oscillatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOscillatory()
     * @generated
     * @ordered
     */
    protected Boolean oscillatory = OSCILLATORY_EDEFAULT;

    /**
     * This is true if the Oscillatory attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oscillatoryESet;

    /**
     * The default value of the '{@link #getOutOfRange() <em>Out Of Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutOfRange()
     * @generated
     * @ordered
     */
    protected static final Boolean OUT_OF_RANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutOfRange() <em>Out Of Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutOfRange()
     * @generated
     * @ordered
     */
    protected Boolean outOfRange = OUT_OF_RANGE_EDEFAULT;

    /**
     * This is true if the Out Of Range attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outOfRangeESet;

    /**
     * The default value of the '{@link #getOverFlow() <em>Over Flow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOverFlow()
     * @generated
     * @ordered
     */
    protected static final Boolean OVER_FLOW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOverFlow() <em>Over Flow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOverFlow()
     * @generated
     * @ordered
     */
    protected Boolean overFlow = OVER_FLOW_EDEFAULT;

    /**
     * This is true if the Over Flow attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean overFlowESet;

    /**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final Source SOURCE_EDEFAULT = Source.PROCESS;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected Source source = SOURCE_EDEFAULT;

    /**
     * This is true if the Source attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sourceESet;

    /**
     * The default value of the '{@link #getSuspect() <em>Suspect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuspect()
     * @generated
     * @ordered
     */
    protected static final Boolean SUSPECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuspect() <em>Suspect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuspect()
     * @generated
     * @ordered
     */
    protected Boolean suspect = SUSPECT_EDEFAULT;

    /**
     * This is true if the Suspect attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean suspectESet;

    /**
     * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTest()
     * @generated
     * @ordered
     */
    protected static final Boolean TEST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTest()
     * @generated
     * @ordered
     */
    protected Boolean test = TEST_EDEFAULT;

    /**
     * This is true if the Test attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testESet;

    /**
     * The default value of the '{@link #getValidity() <em>Validity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidity()
     * @generated
     * @ordered
     */
    protected static final Validity VALIDITY_EDEFAULT = Validity.GOOD;

    /**
     * The cached value of the '{@link #getValidity() <em>Validity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidity()
     * @generated
     * @ordered
     */
    protected Validity validity = VALIDITY_EDEFAULT;

    /**
     * This is true if the Validity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean validityESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Quality61850Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getQuality61850();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getBadReference() {
        return badReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBadReference( Boolean newBadReference ) {
        Boolean oldBadReference = badReference;
        badReference = newBadReference;
        boolean oldBadReferenceESet = badReferenceESet;
        badReferenceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.QUALITY61850__BAD_REFERENCE, oldBadReference, badReference, !oldBadReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBadReference() {
        Boolean oldBadReference = badReference;
        boolean oldBadReferenceESet = badReferenceESet;
        badReference = BAD_REFERENCE_EDEFAULT;
        badReferenceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.QUALITY61850__BAD_REFERENCE,
                    oldBadReference, BAD_REFERENCE_EDEFAULT, oldBadReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBadReference() {
        return badReferenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getEstimatorReplaced() {
        return estimatorReplaced;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEstimatorReplaced( Boolean newEstimatorReplaced ) {
        Boolean oldEstimatorReplaced = estimatorReplaced;
        estimatorReplaced = newEstimatorReplaced;
        boolean oldEstimatorReplacedESet = estimatorReplacedESet;
        estimatorReplacedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.QUALITY61850__ESTIMATOR_REPLACED,
                    oldEstimatorReplaced, estimatorReplaced, !oldEstimatorReplacedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEstimatorReplaced() {
        Boolean oldEstimatorReplaced = estimatorReplaced;
        boolean oldEstimatorReplacedESet = estimatorReplacedESet;
        estimatorReplaced = ESTIMATOR_REPLACED_EDEFAULT;
        estimatorReplacedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.QUALITY61850__ESTIMATOR_REPLACED,
                    oldEstimatorReplaced, ESTIMATOR_REPLACED_EDEFAULT, oldEstimatorReplacedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEstimatorReplaced() {
        return estimatorReplacedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getFailure() {
        return failure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFailure( Boolean newFailure ) {
        Boolean oldFailure = failure;
        failure = newFailure;
        boolean oldFailureESet = failureESet;
        failureESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.QUALITY61850__FAILURE, oldFailure, failure, !oldFailureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFailure() {
        Boolean oldFailure = failure;
        boolean oldFailureESet = failureESet;
        failure = FAILURE_EDEFAULT;
        failureESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.QUALITY61850__FAILURE, oldFailure, FAILURE_EDEFAULT, oldFailureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFailure() {
        return failureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOldData() {
        return oldData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOldData( Boolean newOldData ) {
        Boolean oldOldData = oldData;
        oldData = newOldData;
        boolean oldOldDataESet = oldDataESet;
        oldDataESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.QUALITY61850__OLD_DATA, oldOldData, oldData, !oldOldDataESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOldData() {
        Boolean oldOldData = oldData;
        boolean oldOldDataESet = oldDataESet;
        oldData = OLD_DATA_EDEFAULT;
        oldDataESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.QUALITY61850__OLD_DATA, oldOldData, OLD_DATA_EDEFAULT, oldOldDataESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOldData() {
        return oldDataESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOperatorBlocked() {
        return operatorBlocked;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperatorBlocked( Boolean newOperatorBlocked ) {
        Boolean oldOperatorBlocked = operatorBlocked;
        operatorBlocked = newOperatorBlocked;
        boolean oldOperatorBlockedESet = operatorBlockedESet;
        operatorBlockedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.QUALITY61850__OPERATOR_BLOCKED,
                    oldOperatorBlocked, operatorBlocked, !oldOperatorBlockedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperatorBlocked() {
        Boolean oldOperatorBlocked = operatorBlocked;
        boolean oldOperatorBlockedESet = operatorBlockedESet;
        operatorBlocked = OPERATOR_BLOCKED_EDEFAULT;
        operatorBlockedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.QUALITY61850__OPERATOR_BLOCKED,
                    oldOperatorBlocked, OPERATOR_BLOCKED_EDEFAULT, oldOperatorBlockedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperatorBlocked() {
        return operatorBlockedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOscillatory() {
        return oscillatory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOscillatory( Boolean newOscillatory ) {
        Boolean oldOscillatory = oscillatory;
        oscillatory = newOscillatory;
        boolean oldOscillatoryESet = oscillatoryESet;
        oscillatoryESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.QUALITY61850__OSCILLATORY, oldOscillatory, oscillatory, !oldOscillatoryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOscillatory() {
        Boolean oldOscillatory = oscillatory;
        boolean oldOscillatoryESet = oscillatoryESet;
        oscillatory = OSCILLATORY_EDEFAULT;
        oscillatoryESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.QUALITY61850__OSCILLATORY, oldOscillatory, OSCILLATORY_EDEFAULT, oldOscillatoryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOscillatory() {
        return oscillatoryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOutOfRange() {
        return outOfRange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutOfRange( Boolean newOutOfRange ) {
        Boolean oldOutOfRange = outOfRange;
        outOfRange = newOutOfRange;
        boolean oldOutOfRangeESet = outOfRangeESet;
        outOfRangeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.QUALITY61850__OUT_OF_RANGE, oldOutOfRange, outOfRange, !oldOutOfRangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutOfRange() {
        Boolean oldOutOfRange = outOfRange;
        boolean oldOutOfRangeESet = outOfRangeESet;
        outOfRange = OUT_OF_RANGE_EDEFAULT;
        outOfRangeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.QUALITY61850__OUT_OF_RANGE, oldOutOfRange, OUT_OF_RANGE_EDEFAULT, oldOutOfRangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutOfRange() {
        return outOfRangeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOverFlow() {
        return overFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOverFlow( Boolean newOverFlow ) {
        Boolean oldOverFlow = overFlow;
        overFlow = newOverFlow;
        boolean oldOverFlowESet = overFlowESet;
        overFlowESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.QUALITY61850__OVER_FLOW, oldOverFlow, overFlow, !oldOverFlowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOverFlow() {
        Boolean oldOverFlow = overFlow;
        boolean oldOverFlowESet = overFlowESet;
        overFlow = OVER_FLOW_EDEFAULT;
        overFlowESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.QUALITY61850__OVER_FLOW, oldOverFlow, OVER_FLOW_EDEFAULT, oldOverFlowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOverFlow() {
        return overFlowESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Source getSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSource( Source newSource ) {
        Source oldSource = source;
        source = newSource == null ? SOURCE_EDEFAULT : newSource;
        boolean oldSourceESet = sourceESet;
        sourceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.QUALITY61850__SOURCE, oldSource, source, !oldSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSource() {
        Source oldSource = source;
        boolean oldSourceESet = sourceESet;
        source = SOURCE_EDEFAULT;
        sourceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.QUALITY61850__SOURCE, oldSource, SOURCE_EDEFAULT, oldSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSource() {
        return sourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSuspect() {
        return suspect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSuspect( Boolean newSuspect ) {
        Boolean oldSuspect = suspect;
        suspect = newSuspect;
        boolean oldSuspectESet = suspectESet;
        suspectESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.QUALITY61850__SUSPECT, oldSuspect, suspect, !oldSuspectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSuspect() {
        Boolean oldSuspect = suspect;
        boolean oldSuspectESet = suspectESet;
        suspect = SUSPECT_EDEFAULT;
        suspectESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.QUALITY61850__SUSPECT, oldSuspect, SUSPECT_EDEFAULT, oldSuspectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSuspect() {
        return suspectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getTest() {
        return test;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTest( Boolean newTest ) {
        Boolean oldTest = test;
        test = newTest;
        boolean oldTestESet = testESet;
        testESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.QUALITY61850__TEST, oldTest, test, !oldTestESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTest() {
        Boolean oldTest = test;
        boolean oldTestESet = testESet;
        test = TEST_EDEFAULT;
        testESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.QUALITY61850__TEST, oldTest, TEST_EDEFAULT, oldTestESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTest() {
        return testESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Validity getValidity() {
        return validity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValidity( Validity newValidity ) {
        Validity oldValidity = validity;
        validity = newValidity == null ? VALIDITY_EDEFAULT : newValidity;
        boolean oldValidityESet = validityESet;
        validityESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.QUALITY61850__VALIDITY, oldValidity, validity, !oldValidityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValidity() {
        Validity oldValidity = validity;
        boolean oldValidityESet = validityESet;
        validity = VALIDITY_EDEFAULT;
        validityESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.QUALITY61850__VALIDITY, oldValidity, VALIDITY_EDEFAULT, oldValidityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValidity() {
        return validityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.QUALITY61850__BAD_REFERENCE:
            return getBadReference();
        case CimPackage.QUALITY61850__ESTIMATOR_REPLACED:
            return getEstimatorReplaced();
        case CimPackage.QUALITY61850__FAILURE:
            return getFailure();
        case CimPackage.QUALITY61850__OLD_DATA:
            return getOldData();
        case CimPackage.QUALITY61850__OPERATOR_BLOCKED:
            return getOperatorBlocked();
        case CimPackage.QUALITY61850__OSCILLATORY:
            return getOscillatory();
        case CimPackage.QUALITY61850__OUT_OF_RANGE:
            return getOutOfRange();
        case CimPackage.QUALITY61850__OVER_FLOW:
            return getOverFlow();
        case CimPackage.QUALITY61850__SOURCE:
            return getSource();
        case CimPackage.QUALITY61850__SUSPECT:
            return getSuspect();
        case CimPackage.QUALITY61850__TEST:
            return getTest();
        case CimPackage.QUALITY61850__VALIDITY:
            return getValidity();
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
        case CimPackage.QUALITY61850__BAD_REFERENCE:
            setBadReference( ( Boolean ) newValue );
            return;
        case CimPackage.QUALITY61850__ESTIMATOR_REPLACED:
            setEstimatorReplaced( ( Boolean ) newValue );
            return;
        case CimPackage.QUALITY61850__FAILURE:
            setFailure( ( Boolean ) newValue );
            return;
        case CimPackage.QUALITY61850__OLD_DATA:
            setOldData( ( Boolean ) newValue );
            return;
        case CimPackage.QUALITY61850__OPERATOR_BLOCKED:
            setOperatorBlocked( ( Boolean ) newValue );
            return;
        case CimPackage.QUALITY61850__OSCILLATORY:
            setOscillatory( ( Boolean ) newValue );
            return;
        case CimPackage.QUALITY61850__OUT_OF_RANGE:
            setOutOfRange( ( Boolean ) newValue );
            return;
        case CimPackage.QUALITY61850__OVER_FLOW:
            setOverFlow( ( Boolean ) newValue );
            return;
        case CimPackage.QUALITY61850__SOURCE:
            setSource( ( Source ) newValue );
            return;
        case CimPackage.QUALITY61850__SUSPECT:
            setSuspect( ( Boolean ) newValue );
            return;
        case CimPackage.QUALITY61850__TEST:
            setTest( ( Boolean ) newValue );
            return;
        case CimPackage.QUALITY61850__VALIDITY:
            setValidity( ( Validity ) newValue );
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
        case CimPackage.QUALITY61850__BAD_REFERENCE:
            unsetBadReference();
            return;
        case CimPackage.QUALITY61850__ESTIMATOR_REPLACED:
            unsetEstimatorReplaced();
            return;
        case CimPackage.QUALITY61850__FAILURE:
            unsetFailure();
            return;
        case CimPackage.QUALITY61850__OLD_DATA:
            unsetOldData();
            return;
        case CimPackage.QUALITY61850__OPERATOR_BLOCKED:
            unsetOperatorBlocked();
            return;
        case CimPackage.QUALITY61850__OSCILLATORY:
            unsetOscillatory();
            return;
        case CimPackage.QUALITY61850__OUT_OF_RANGE:
            unsetOutOfRange();
            return;
        case CimPackage.QUALITY61850__OVER_FLOW:
            unsetOverFlow();
            return;
        case CimPackage.QUALITY61850__SOURCE:
            unsetSource();
            return;
        case CimPackage.QUALITY61850__SUSPECT:
            unsetSuspect();
            return;
        case CimPackage.QUALITY61850__TEST:
            unsetTest();
            return;
        case CimPackage.QUALITY61850__VALIDITY:
            unsetValidity();
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
        case CimPackage.QUALITY61850__BAD_REFERENCE:
            return isSetBadReference();
        case CimPackage.QUALITY61850__ESTIMATOR_REPLACED:
            return isSetEstimatorReplaced();
        case CimPackage.QUALITY61850__FAILURE:
            return isSetFailure();
        case CimPackage.QUALITY61850__OLD_DATA:
            return isSetOldData();
        case CimPackage.QUALITY61850__OPERATOR_BLOCKED:
            return isSetOperatorBlocked();
        case CimPackage.QUALITY61850__OSCILLATORY:
            return isSetOscillatory();
        case CimPackage.QUALITY61850__OUT_OF_RANGE:
            return isSetOutOfRange();
        case CimPackage.QUALITY61850__OVER_FLOW:
            return isSetOverFlow();
        case CimPackage.QUALITY61850__SOURCE:
            return isSetSource();
        case CimPackage.QUALITY61850__SUSPECT:
            return isSetSuspect();
        case CimPackage.QUALITY61850__TEST:
            return isSetTest();
        case CimPackage.QUALITY61850__VALIDITY:
            return isSetValidity();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (badReference: " );
        if( badReferenceESet )
            result.append( badReference );
        else
            result.append( "<unset>" );
        result.append( ", estimatorReplaced: " );
        if( estimatorReplacedESet )
            result.append( estimatorReplaced );
        else
            result.append( "<unset>" );
        result.append( ", failure: " );
        if( failureESet )
            result.append( failure );
        else
            result.append( "<unset>" );
        result.append( ", oldData: " );
        if( oldDataESet )
            result.append( oldData );
        else
            result.append( "<unset>" );
        result.append( ", operatorBlocked: " );
        if( operatorBlockedESet )
            result.append( operatorBlocked );
        else
            result.append( "<unset>" );
        result.append( ", oscillatory: " );
        if( oscillatoryESet )
            result.append( oscillatory );
        else
            result.append( "<unset>" );
        result.append( ", outOfRange: " );
        if( outOfRangeESet )
            result.append( outOfRange );
        else
            result.append( "<unset>" );
        result.append( ", overFlow: " );
        if( overFlowESet )
            result.append( overFlow );
        else
            result.append( "<unset>" );
        result.append( ", source: " );
        if( sourceESet )
            result.append( source );
        else
            result.append( "<unset>" );
        result.append( ", suspect: " );
        if( suspectESet )
            result.append( suspect );
        else
            result.append( "<unset>" );
        result.append( ", test: " );
        if( testESet )
            result.append( test );
        else
            result.append( "<unset>" );
        result.append( ", validity: " );
        if( validityESet )
            result.append( validity );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //Quality61850Impl
