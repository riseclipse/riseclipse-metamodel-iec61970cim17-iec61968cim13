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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFailureClassification;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetFailureMode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerFailureReasonKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FailureIsolationMethodKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerFailureReasonKind;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FailureEventImpl#getBreakerFailureReason <em>Breaker Failure Reason</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FailureEventImpl#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FailureEventImpl#getFailureClassification <em>Failure Classification</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FailureEventImpl#getFailureDateTime <em>Failure Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FailureEventImpl#getFailureIsolationMethod <em>Failure Isolation Method</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FailureEventImpl#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FailureEventImpl#getFaultLocatingMethod <em>Fault Locating Method</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FailureEventImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FailureEventImpl#getRootCause <em>Root Cause</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FailureEventImpl#getTransformerFailureReason <em>Transformer Failure Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureEventImpl extends ActivityRecordImpl implements FailureEvent {
    /**
     * The default value of the '{@link #getBreakerFailureReason() <em>Breaker Failure Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerFailureReason()
     * @generated
     * @ordered
     */
    protected static final BreakerFailureReasonKind BREAKER_FAILURE_REASON_EDEFAULT = BreakerFailureReasonKind.BLAST_VALVE_FAILURE;

    /**
     * The cached value of the '{@link #getBreakerFailureReason() <em>Breaker Failure Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerFailureReason()
     * @generated
     * @ordered
     */
    protected BreakerFailureReasonKind breakerFailureReason = BREAKER_FAILURE_REASON_EDEFAULT;

    /**
     * This is true if the Breaker Failure Reason attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean breakerFailureReasonESet;

    /**
     * The default value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorporateCode()
     * @generated
     * @ordered
     */
    protected static final String CORPORATE_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorporateCode()
     * @generated
     * @ordered
     */
    protected String corporateCode = CORPORATE_CODE_EDEFAULT;

    /**
     * This is true if the Corporate Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean corporateCodeESet;

    /**
     * The default value of the '{@link #getFailureClassification() <em>Failure Classification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailureClassification()
     * @generated
     * @ordered
     */
    protected static final AssetFailureClassification FAILURE_CLASSIFICATION_EDEFAULT = AssetFailureClassification.MAJOR;

    /**
     * The cached value of the '{@link #getFailureClassification() <em>Failure Classification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailureClassification()
     * @generated
     * @ordered
     */
    protected AssetFailureClassification failureClassification = FAILURE_CLASSIFICATION_EDEFAULT;

    /**
     * This is true if the Failure Classification attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean failureClassificationESet;

    /**
     * The default value of the '{@link #getFailureDateTime() <em>Failure Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailureDateTime()
     * @generated
     * @ordered
     */
    protected static final Date FAILURE_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFailureDateTime() <em>Failure Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailureDateTime()
     * @generated
     * @ordered
     */
    protected Date failureDateTime = FAILURE_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Failure Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean failureDateTimeESet;

    /**
     * The default value of the '{@link #getFailureIsolationMethod() <em>Failure Isolation Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailureIsolationMethod()
     * @generated
     * @ordered
     */
    protected static final FailureIsolationMethodKind FAILURE_ISOLATION_METHOD_EDEFAULT = FailureIsolationMethodKind.BREAKER_OPERATION;

    /**
     * The cached value of the '{@link #getFailureIsolationMethod() <em>Failure Isolation Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailureIsolationMethod()
     * @generated
     * @ordered
     */
    protected FailureIsolationMethodKind failureIsolationMethod = FAILURE_ISOLATION_METHOD_EDEFAULT;

    /**
     * This is true if the Failure Isolation Method attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean failureIsolationMethodESet;

    /**
     * The default value of the '{@link #getFailureMode() <em>Failure Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailureMode()
     * @generated
     * @ordered
     */
    protected static final AssetFailureMode FAILURE_MODE_EDEFAULT = AssetFailureMode.FAIL_TO_CARRY_LOAD;

    /**
     * The cached value of the '{@link #getFailureMode() <em>Failure Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFailureMode()
     * @generated
     * @ordered
     */
    protected AssetFailureMode failureMode = FAILURE_MODE_EDEFAULT;

    /**
     * This is true if the Failure Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean failureModeESet;

    /**
     * The default value of the '{@link #getFaultLocatingMethod() <em>Fault Locating Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaultLocatingMethod()
     * @generated
     * @ordered
     */
    protected static final String FAULT_LOCATING_METHOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFaultLocatingMethod() <em>Fault Locating Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaultLocatingMethod()
     * @generated
     * @ordered
     */
    protected String faultLocatingMethod = FAULT_LOCATING_METHOD_EDEFAULT;

    /**
     * This is true if the Fault Locating Method attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean faultLocatingMethodESet;

    /**
     * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected static final String LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected String location = LOCATION_EDEFAULT;

    /**
     * This is true if the Location attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean locationESet;

    /**
     * The default value of the '{@link #getRootCause() <em>Root Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootCause()
     * @generated
     * @ordered
     */
    protected static final String ROOT_CAUSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRootCause() <em>Root Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootCause()
     * @generated
     * @ordered
     */
    protected String rootCause = ROOT_CAUSE_EDEFAULT;

    /**
     * This is true if the Root Cause attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rootCauseESet;

    /**
     * The default value of the '{@link #getTransformerFailureReason() <em>Transformer Failure Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerFailureReason()
     * @generated
     * @ordered
     */
    protected static final TransformerFailureReasonKind TRANSFORMER_FAILURE_REASON_EDEFAULT = TransformerFailureReasonKind.BUSHING_FAILURE;

    /**
     * The cached value of the '{@link #getTransformerFailureReason() <em>Transformer Failure Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerFailureReason()
     * @generated
     * @ordered
     */
    protected TransformerFailureReasonKind transformerFailureReason = TRANSFORMER_FAILURE_REASON_EDEFAULT;

    /**
     * This is true if the Transformer Failure Reason attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transformerFailureReasonESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FailureEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getFailureEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BreakerFailureReasonKind getBreakerFailureReason() {
        return breakerFailureReason;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBreakerFailureReason( BreakerFailureReasonKind newBreakerFailureReason ) {
        BreakerFailureReasonKind oldBreakerFailureReason = breakerFailureReason;
        breakerFailureReason = newBreakerFailureReason == null ? BREAKER_FAILURE_REASON_EDEFAULT
                : newBreakerFailureReason;
        boolean oldBreakerFailureReasonESet = breakerFailureReasonESet;
        breakerFailureReasonESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FAILURE_EVENT__BREAKER_FAILURE_REASON,
                    oldBreakerFailureReason, breakerFailureReason, !oldBreakerFailureReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBreakerFailureReason() {
        BreakerFailureReasonKind oldBreakerFailureReason = breakerFailureReason;
        boolean oldBreakerFailureReasonESet = breakerFailureReasonESet;
        breakerFailureReason = BREAKER_FAILURE_REASON_EDEFAULT;
        breakerFailureReasonESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FAILURE_EVENT__BREAKER_FAILURE_REASON,
                    oldBreakerFailureReason, BREAKER_FAILURE_REASON_EDEFAULT, oldBreakerFailureReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBreakerFailureReason() {
        return breakerFailureReasonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCorporateCode() {
        return corporateCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCorporateCode( String newCorporateCode ) {
        String oldCorporateCode = corporateCode;
        corporateCode = newCorporateCode;
        boolean oldCorporateCodeESet = corporateCodeESet;
        corporateCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FAILURE_EVENT__CORPORATE_CODE, oldCorporateCode, corporateCode, !oldCorporateCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCorporateCode() {
        String oldCorporateCode = corporateCode;
        boolean oldCorporateCodeESet = corporateCodeESet;
        corporateCode = CORPORATE_CODE_EDEFAULT;
        corporateCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FAILURE_EVENT__CORPORATE_CODE,
                    oldCorporateCode, CORPORATE_CODE_EDEFAULT, oldCorporateCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCorporateCode() {
        return corporateCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetFailureClassification getFailureClassification() {
        return failureClassification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFailureClassification( AssetFailureClassification newFailureClassification ) {
        AssetFailureClassification oldFailureClassification = failureClassification;
        failureClassification = newFailureClassification == null ? FAILURE_CLASSIFICATION_EDEFAULT
                : newFailureClassification;
        boolean oldFailureClassificationESet = failureClassificationESet;
        failureClassificationESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FAILURE_EVENT__FAILURE_CLASSIFICATION,
                    oldFailureClassification, failureClassification, !oldFailureClassificationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFailureClassification() {
        AssetFailureClassification oldFailureClassification = failureClassification;
        boolean oldFailureClassificationESet = failureClassificationESet;
        failureClassification = FAILURE_CLASSIFICATION_EDEFAULT;
        failureClassificationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FAILURE_EVENT__FAILURE_CLASSIFICATION,
                    oldFailureClassification, FAILURE_CLASSIFICATION_EDEFAULT, oldFailureClassificationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFailureClassification() {
        return failureClassificationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getFailureDateTime() {
        return failureDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFailureDateTime( Date newFailureDateTime ) {
        Date oldFailureDateTime = failureDateTime;
        failureDateTime = newFailureDateTime;
        boolean oldFailureDateTimeESet = failureDateTimeESet;
        failureDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FAILURE_EVENT__FAILURE_DATE_TIME,
                    oldFailureDateTime, failureDateTime, !oldFailureDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFailureDateTime() {
        Date oldFailureDateTime = failureDateTime;
        boolean oldFailureDateTimeESet = failureDateTimeESet;
        failureDateTime = FAILURE_DATE_TIME_EDEFAULT;
        failureDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FAILURE_EVENT__FAILURE_DATE_TIME,
                    oldFailureDateTime, FAILURE_DATE_TIME_EDEFAULT, oldFailureDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFailureDateTime() {
        return failureDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FailureIsolationMethodKind getFailureIsolationMethod() {
        return failureIsolationMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFailureIsolationMethod( FailureIsolationMethodKind newFailureIsolationMethod ) {
        FailureIsolationMethodKind oldFailureIsolationMethod = failureIsolationMethod;
        failureIsolationMethod = newFailureIsolationMethod == null ? FAILURE_ISOLATION_METHOD_EDEFAULT
                : newFailureIsolationMethod;
        boolean oldFailureIsolationMethodESet = failureIsolationMethodESet;
        failureIsolationMethodESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD,
                    oldFailureIsolationMethod, failureIsolationMethod, !oldFailureIsolationMethodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFailureIsolationMethod() {
        FailureIsolationMethodKind oldFailureIsolationMethod = failureIsolationMethod;
        boolean oldFailureIsolationMethodESet = failureIsolationMethodESet;
        failureIsolationMethod = FAILURE_ISOLATION_METHOD_EDEFAULT;
        failureIsolationMethodESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD,
                        oldFailureIsolationMethod, FAILURE_ISOLATION_METHOD_EDEFAULT, oldFailureIsolationMethodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFailureIsolationMethod() {
        return failureIsolationMethodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetFailureMode getFailureMode() {
        return failureMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFailureMode( AssetFailureMode newFailureMode ) {
        AssetFailureMode oldFailureMode = failureMode;
        failureMode = newFailureMode == null ? FAILURE_MODE_EDEFAULT : newFailureMode;
        boolean oldFailureModeESet = failureModeESet;
        failureModeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FAILURE_EVENT__FAILURE_MODE, oldFailureMode, failureMode, !oldFailureModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFailureMode() {
        AssetFailureMode oldFailureMode = failureMode;
        boolean oldFailureModeESet = failureModeESet;
        failureMode = FAILURE_MODE_EDEFAULT;
        failureModeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FAILURE_EVENT__FAILURE_MODE, oldFailureMode, FAILURE_MODE_EDEFAULT, oldFailureModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFailureMode() {
        return failureModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFaultLocatingMethod() {
        return faultLocatingMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFaultLocatingMethod( String newFaultLocatingMethod ) {
        String oldFaultLocatingMethod = faultLocatingMethod;
        faultLocatingMethod = newFaultLocatingMethod;
        boolean oldFaultLocatingMethodESet = faultLocatingMethodESet;
        faultLocatingMethodESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD,
                    oldFaultLocatingMethod, faultLocatingMethod, !oldFaultLocatingMethodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFaultLocatingMethod() {
        String oldFaultLocatingMethod = faultLocatingMethod;
        boolean oldFaultLocatingMethodESet = faultLocatingMethodESet;
        faultLocatingMethod = FAULT_LOCATING_METHOD_EDEFAULT;
        faultLocatingMethodESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD,
                    oldFaultLocatingMethod, FAULT_LOCATING_METHOD_EDEFAULT, oldFaultLocatingMethodESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFaultLocatingMethod() {
        return faultLocatingMethodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLocation( String newLocation ) {
        String oldLocation = location;
        location = newLocation;
        boolean oldLocationESet = locationESet;
        locationESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FAILURE_EVENT__LOCATION, oldLocation, location, !oldLocationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLocation() {
        String oldLocation = location;
        boolean oldLocationESet = locationESet;
        location = LOCATION_EDEFAULT;
        locationESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FAILURE_EVENT__LOCATION, oldLocation, LOCATION_EDEFAULT, oldLocationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocation() {
        return locationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRootCause() {
        return rootCause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRootCause( String newRootCause ) {
        String oldRootCause = rootCause;
        rootCause = newRootCause;
        boolean oldRootCauseESet = rootCauseESet;
        rootCauseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FAILURE_EVENT__ROOT_CAUSE, oldRootCause, rootCause, !oldRootCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRootCause() {
        String oldRootCause = rootCause;
        boolean oldRootCauseESet = rootCauseESet;
        rootCause = ROOT_CAUSE_EDEFAULT;
        rootCauseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FAILURE_EVENT__ROOT_CAUSE, oldRootCause, ROOT_CAUSE_EDEFAULT, oldRootCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRootCause() {
        return rootCauseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerFailureReasonKind getTransformerFailureReason() {
        return transformerFailureReason;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransformerFailureReason( TransformerFailureReasonKind newTransformerFailureReason ) {
        TransformerFailureReasonKind oldTransformerFailureReason = transformerFailureReason;
        transformerFailureReason = newTransformerFailureReason == null ? TRANSFORMER_FAILURE_REASON_EDEFAULT
                : newTransformerFailureReason;
        boolean oldTransformerFailureReasonESet = transformerFailureReasonESet;
        transformerFailureReasonESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.FAILURE_EVENT__TRANSFORMER_FAILURE_REASON,
                        oldTransformerFailureReason, transformerFailureReason, !oldTransformerFailureReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerFailureReason() {
        TransformerFailureReasonKind oldTransformerFailureReason = transformerFailureReason;
        boolean oldTransformerFailureReasonESet = transformerFailureReasonESet;
        transformerFailureReason = TRANSFORMER_FAILURE_REASON_EDEFAULT;
        transformerFailureReasonESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FAILURE_EVENT__TRANSFORMER_FAILURE_REASON, oldTransformerFailureReason,
                TRANSFORMER_FAILURE_REASON_EDEFAULT, oldTransformerFailureReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerFailureReason() {
        return transformerFailureReasonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.FAILURE_EVENT__BREAKER_FAILURE_REASON:
            return getBreakerFailureReason();
        case CimPackage.FAILURE_EVENT__CORPORATE_CODE:
            return getCorporateCode();
        case CimPackage.FAILURE_EVENT__FAILURE_CLASSIFICATION:
            return getFailureClassification();
        case CimPackage.FAILURE_EVENT__FAILURE_DATE_TIME:
            return getFailureDateTime();
        case CimPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
            return getFailureIsolationMethod();
        case CimPackage.FAILURE_EVENT__FAILURE_MODE:
            return getFailureMode();
        case CimPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
            return getFaultLocatingMethod();
        case CimPackage.FAILURE_EVENT__LOCATION:
            return getLocation();
        case CimPackage.FAILURE_EVENT__ROOT_CAUSE:
            return getRootCause();
        case CimPackage.FAILURE_EVENT__TRANSFORMER_FAILURE_REASON:
            return getTransformerFailureReason();
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
        case CimPackage.FAILURE_EVENT__BREAKER_FAILURE_REASON:
            setBreakerFailureReason( ( BreakerFailureReasonKind ) newValue );
            return;
        case CimPackage.FAILURE_EVENT__CORPORATE_CODE:
            setCorporateCode( ( String ) newValue );
            return;
        case CimPackage.FAILURE_EVENT__FAILURE_CLASSIFICATION:
            setFailureClassification( ( AssetFailureClassification ) newValue );
            return;
        case CimPackage.FAILURE_EVENT__FAILURE_DATE_TIME:
            setFailureDateTime( ( Date ) newValue );
            return;
        case CimPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
            setFailureIsolationMethod( ( FailureIsolationMethodKind ) newValue );
            return;
        case CimPackage.FAILURE_EVENT__FAILURE_MODE:
            setFailureMode( ( AssetFailureMode ) newValue );
            return;
        case CimPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
            setFaultLocatingMethod( ( String ) newValue );
            return;
        case CimPackage.FAILURE_EVENT__LOCATION:
            setLocation( ( String ) newValue );
            return;
        case CimPackage.FAILURE_EVENT__ROOT_CAUSE:
            setRootCause( ( String ) newValue );
            return;
        case CimPackage.FAILURE_EVENT__TRANSFORMER_FAILURE_REASON:
            setTransformerFailureReason( ( TransformerFailureReasonKind ) newValue );
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
        case CimPackage.FAILURE_EVENT__BREAKER_FAILURE_REASON:
            unsetBreakerFailureReason();
            return;
        case CimPackage.FAILURE_EVENT__CORPORATE_CODE:
            unsetCorporateCode();
            return;
        case CimPackage.FAILURE_EVENT__FAILURE_CLASSIFICATION:
            unsetFailureClassification();
            return;
        case CimPackage.FAILURE_EVENT__FAILURE_DATE_TIME:
            unsetFailureDateTime();
            return;
        case CimPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
            unsetFailureIsolationMethod();
            return;
        case CimPackage.FAILURE_EVENT__FAILURE_MODE:
            unsetFailureMode();
            return;
        case CimPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
            unsetFaultLocatingMethod();
            return;
        case CimPackage.FAILURE_EVENT__LOCATION:
            unsetLocation();
            return;
        case CimPackage.FAILURE_EVENT__ROOT_CAUSE:
            unsetRootCause();
            return;
        case CimPackage.FAILURE_EVENT__TRANSFORMER_FAILURE_REASON:
            unsetTransformerFailureReason();
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
        case CimPackage.FAILURE_EVENT__BREAKER_FAILURE_REASON:
            return isSetBreakerFailureReason();
        case CimPackage.FAILURE_EVENT__CORPORATE_CODE:
            return isSetCorporateCode();
        case CimPackage.FAILURE_EVENT__FAILURE_CLASSIFICATION:
            return isSetFailureClassification();
        case CimPackage.FAILURE_EVENT__FAILURE_DATE_TIME:
            return isSetFailureDateTime();
        case CimPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
            return isSetFailureIsolationMethod();
        case CimPackage.FAILURE_EVENT__FAILURE_MODE:
            return isSetFailureMode();
        case CimPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
            return isSetFaultLocatingMethod();
        case CimPackage.FAILURE_EVENT__LOCATION:
            return isSetLocation();
        case CimPackage.FAILURE_EVENT__ROOT_CAUSE:
            return isSetRootCause();
        case CimPackage.FAILURE_EVENT__TRANSFORMER_FAILURE_REASON:
            return isSetTransformerFailureReason();
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
        result.append( " (breakerFailureReason: " );
        if( breakerFailureReasonESet )
            result.append( breakerFailureReason );
        else
            result.append( "<unset>" );
        result.append( ", corporateCode: " );
        if( corporateCodeESet )
            result.append( corporateCode );
        else
            result.append( "<unset>" );
        result.append( ", failureClassification: " );
        if( failureClassificationESet )
            result.append( failureClassification );
        else
            result.append( "<unset>" );
        result.append( ", failureDateTime: " );
        if( failureDateTimeESet )
            result.append( failureDateTime );
        else
            result.append( "<unset>" );
        result.append( ", failureIsolationMethod: " );
        if( failureIsolationMethodESet )
            result.append( failureIsolationMethod );
        else
            result.append( "<unset>" );
        result.append( ", failureMode: " );
        if( failureModeESet )
            result.append( failureMode );
        else
            result.append( "<unset>" );
        result.append( ", faultLocatingMethod: " );
        if( faultLocatingMethodESet )
            result.append( faultLocatingMethod );
        else
            result.append( "<unset>" );
        result.append( ", location: " );
        if( locationESet )
            result.append( location );
        else
            result.append( "<unset>" );
        result.append( ", rootCause: " );
        if( rootCauseESet )
            result.append( rootCause );
        else
            result.append( "<unset>" );
        result.append( ", transformerFailureReason: " );
        if( transformerFailureReasonESet )
            result.append( transformerFailureReason );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //FailureEventImpl
