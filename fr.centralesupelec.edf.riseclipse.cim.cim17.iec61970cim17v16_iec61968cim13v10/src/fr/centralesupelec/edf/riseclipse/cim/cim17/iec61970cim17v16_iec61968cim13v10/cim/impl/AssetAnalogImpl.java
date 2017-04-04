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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Analog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetAnalogImpl#getDetectionLimit <em>Detection Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetAnalogImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetAnalogImpl#getReportingTemperature <em>Reporting Temperature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AssetAnalogImpl#getTestStandard <em>Test Standard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetAnalogImpl extends AnalogImpl implements AssetAnalog {
    /**
     * The default value of the '{@link #getDetectionLimit() <em>Detection Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDetectionLimit()
     * @generated
     * @ordered
     */
    protected static final Float DETECTION_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDetectionLimit() <em>Detection Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDetectionLimit()
     * @generated
     * @ordered
     */
    protected Float detectionLimit = DETECTION_LIMIT_EDEFAULT;

    /**
     * This is true if the Detection Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean detectionLimitESet;

    /**
     * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected static final Float PRECISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected Float precision = PRECISION_EDEFAULT;

    /**
     * This is true if the Precision attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean precisionESet;

    /**
     * The default value of the '{@link #getReportingTemperature() <em>Reporting Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportingTemperature()
     * @generated
     * @ordered
     */
    protected static final Float REPORTING_TEMPERATURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReportingTemperature() <em>Reporting Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportingTemperature()
     * @generated
     * @ordered
     */
    protected Float reportingTemperature = REPORTING_TEMPERATURE_EDEFAULT;

    /**
     * This is true if the Reporting Temperature attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reportingTemperatureESet;

    /**
     * The cached value of the '{@link #getTestStandard() <em>Test Standard</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestStandard()
     * @generated
     * @ordered
     */
    protected TestStandard testStandard;

    /**
     * This is true if the Test Standard reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testStandardESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetAnalogImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAssetAnalog();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDetectionLimit() {
        return detectionLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDetectionLimit( Float newDetectionLimit ) {
        Float oldDetectionLimit = detectionLimit;
        detectionLimit = newDetectionLimit;
        boolean oldDetectionLimitESet = detectionLimitESet;
        detectionLimitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET_ANALOG__DETECTION_LIMIT, oldDetectionLimit, detectionLimit, !oldDetectionLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDetectionLimit() {
        Float oldDetectionLimit = detectionLimit;
        boolean oldDetectionLimitESet = detectionLimitESet;
        detectionLimit = DETECTION_LIMIT_EDEFAULT;
        detectionLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET_ANALOG__DETECTION_LIMIT,
                    oldDetectionLimit, DETECTION_LIMIT_EDEFAULT, oldDetectionLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDetectionLimit() {
        return detectionLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPrecision() {
        return precision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrecision( Float newPrecision ) {
        Float oldPrecision = precision;
        precision = newPrecision;
        boolean oldPrecisionESet = precisionESet;
        precisionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASSET_ANALOG__PRECISION, oldPrecision, precision, !oldPrecisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrecision() {
        Float oldPrecision = precision;
        boolean oldPrecisionESet = precisionESet;
        precision = PRECISION_EDEFAULT;
        precisionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASSET_ANALOG__PRECISION, oldPrecision, PRECISION_EDEFAULT, oldPrecisionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrecision() {
        return precisionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getReportingTemperature() {
        return reportingTemperature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReportingTemperature( Float newReportingTemperature ) {
        Float oldReportingTemperature = reportingTemperature;
        reportingTemperature = newReportingTemperature;
        boolean oldReportingTemperatureESet = reportingTemperatureESet;
        reportingTemperatureESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASSET_ANALOG__REPORTING_TEMPERATURE,
                    oldReportingTemperature, reportingTemperature, !oldReportingTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReportingTemperature() {
        Float oldReportingTemperature = reportingTemperature;
        boolean oldReportingTemperatureESet = reportingTemperatureESet;
        reportingTemperature = REPORTING_TEMPERATURE_EDEFAULT;
        reportingTemperatureESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASSET_ANALOG__REPORTING_TEMPERATURE,
                    oldReportingTemperature, REPORTING_TEMPERATURE_EDEFAULT, oldReportingTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReportingTemperature() {
        return reportingTemperatureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TestStandard getTestStandard() {
        return testStandard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTestStandard( TestStandard newTestStandard, NotificationChain msgs ) {
        TestStandard oldTestStandard = testStandard;
        testStandard = newTestStandard;
        boolean oldTestStandardESet = testStandardESet;
        testStandardESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_ANALOG__TEST_STANDARD, oldTestStandard, newTestStandard, !oldTestStandardESet );
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
    public void setTestStandard( TestStandard newTestStandard ) {
        if( newTestStandard != testStandard ) {
            NotificationChain msgs = null;
            if( testStandard != null ) msgs = ( ( InternalEObject ) testStandard ).eInverseRemove( this,
                    CimPackage.TEST_STANDARD__ASSET_ANALOG, TestStandard.class, msgs );
            if( newTestStandard != null ) msgs = ( ( InternalEObject ) newTestStandard ).eInverseAdd( this,
                    CimPackage.TEST_STANDARD__ASSET_ANALOG, TestStandard.class, msgs );
            msgs = basicSetTestStandard( newTestStandard, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardESet = testStandardESet;
            testStandardESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASSET_ANALOG__TEST_STANDARD, newTestStandard, newTestStandard, !oldTestStandardESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTestStandard( NotificationChain msgs ) {
        TestStandard oldTestStandard = testStandard;
        testStandard = null;
        boolean oldTestStandardESet = testStandardESet;
        testStandardESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_ANALOG__TEST_STANDARD, oldTestStandard, null, oldTestStandardESet );
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
    public void unsetTestStandard() {
        if( testStandard != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) testStandard ).eInverseRemove( this, CimPackage.TEST_STANDARD__ASSET_ANALOG,
                    TestStandard.class, msgs );
            msgs = basicUnsetTestStandard( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTestStandardESet = testStandardESet;
            testStandardESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASSET_ANALOG__TEST_STANDARD, null, null, oldTestStandardESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestStandard() {
        return testStandardESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ASSET_ANALOG__TEST_STANDARD:
            if( testStandard != null ) msgs = ( ( InternalEObject ) testStandard ).eInverseRemove( this,
                    CimPackage.TEST_STANDARD__ASSET_ANALOG, TestStandard.class, msgs );
            return basicSetTestStandard( ( TestStandard ) otherEnd, msgs );
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
        case CimPackage.ASSET_ANALOG__TEST_STANDARD:
            return basicUnsetTestStandard( msgs );
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
        case CimPackage.ASSET_ANALOG__DETECTION_LIMIT:
            return getDetectionLimit();
        case CimPackage.ASSET_ANALOG__PRECISION:
            return getPrecision();
        case CimPackage.ASSET_ANALOG__REPORTING_TEMPERATURE:
            return getReportingTemperature();
        case CimPackage.ASSET_ANALOG__TEST_STANDARD:
            return getTestStandard();
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
        case CimPackage.ASSET_ANALOG__DETECTION_LIMIT:
            setDetectionLimit( ( Float ) newValue );
            return;
        case CimPackage.ASSET_ANALOG__PRECISION:
            setPrecision( ( Float ) newValue );
            return;
        case CimPackage.ASSET_ANALOG__REPORTING_TEMPERATURE:
            setReportingTemperature( ( Float ) newValue );
            return;
        case CimPackage.ASSET_ANALOG__TEST_STANDARD:
            setTestStandard( ( TestStandard ) newValue );
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
        case CimPackage.ASSET_ANALOG__DETECTION_LIMIT:
            unsetDetectionLimit();
            return;
        case CimPackage.ASSET_ANALOG__PRECISION:
            unsetPrecision();
            return;
        case CimPackage.ASSET_ANALOG__REPORTING_TEMPERATURE:
            unsetReportingTemperature();
            return;
        case CimPackage.ASSET_ANALOG__TEST_STANDARD:
            unsetTestStandard();
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
        case CimPackage.ASSET_ANALOG__DETECTION_LIMIT:
            return isSetDetectionLimit();
        case CimPackage.ASSET_ANALOG__PRECISION:
            return isSetPrecision();
        case CimPackage.ASSET_ANALOG__REPORTING_TEMPERATURE:
            return isSetReportingTemperature();
        case CimPackage.ASSET_ANALOG__TEST_STANDARD:
            return isSetTestStandard();
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
        result.append( " (detectionLimit: " );
        if( detectionLimitESet )
            result.append( detectionLimit );
        else
            result.append( "<unset>" );
        result.append( ", precision: " );
        if( precisionESet )
            result.append( precision );
        else
            result.append( "<unset>" );
        result.append( ", reportingTemperature: " );
        if( reportingTemperatureESet )
            result.append( reportingTemperature );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AssetAnalogImpl
