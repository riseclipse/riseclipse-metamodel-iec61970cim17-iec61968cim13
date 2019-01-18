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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SVCControlMode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StaticVarCompensator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Var Compensator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StaticVarCompensatorImpl#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StaticVarCompensatorImpl#getInductiveRating <em>Inductive Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StaticVarCompensatorImpl#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StaticVarCompensatorImpl#getSlope <em>Slope</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StaticVarCompensatorImpl#getSVCControlMode <em>SVC Control Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StaticVarCompensatorImpl#getVoltageSetPoint <em>Voltage Set Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticVarCompensatorImpl extends RegulatingCondEqImpl implements StaticVarCompensator {
    /**
     * The default value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacitiveRating()
     * @generated
     * @ordered
     */
    protected static final Float CAPACITIVE_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacitiveRating()
     * @generated
     * @ordered
     */
    protected Float capacitiveRating = CAPACITIVE_RATING_EDEFAULT;

    /**
     * This is true if the Capacitive Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capacitiveRatingESet;

    /**
     * The default value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductiveRating()
     * @generated
     * @ordered
     */
    protected static final Float INDUCTIVE_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductiveRating()
     * @generated
     * @ordered
     */
    protected Float inductiveRating = INDUCTIVE_RATING_EDEFAULT;

    /**
     * This is true if the Inductive Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inductiveRatingESet;

    /**
     * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected static final Float Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected Float q = Q_EDEFAULT;

    /**
     * This is true if the Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qESet;

    /**
     * The default value of the '{@link #getSlope() <em>Slope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlope()
     * @generated
     * @ordered
     */
    protected static final Float SLOPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSlope() <em>Slope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlope()
     * @generated
     * @ordered
     */
    protected Float slope = SLOPE_EDEFAULT;

    /**
     * This is true if the Slope attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean slopeESet;

    /**
     * The default value of the '{@link #getSVCControlMode() <em>SVC Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSVCControlMode()
     * @generated
     * @ordered
     */
    protected static final SVCControlMode SVC_CONTROL_MODE_EDEFAULT = SVCControlMode.REACTIVE_POWER;

    /**
     * The cached value of the '{@link #getSVCControlMode() <em>SVC Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSVCControlMode()
     * @generated
     * @ordered
     */
    protected SVCControlMode sVCControlMode = SVC_CONTROL_MODE_EDEFAULT;

    /**
     * This is true if the SVC Control Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sVCControlModeESet;

    /**
     * The default value of the '{@link #getVoltageSetPoint() <em>Voltage Set Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageSetPoint()
     * @generated
     * @ordered
     */
    protected static final Float VOLTAGE_SET_POINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageSetPoint() <em>Voltage Set Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageSetPoint()
     * @generated
     * @ordered
     */
    protected Float voltageSetPoint = VOLTAGE_SET_POINT_EDEFAULT;

    /**
     * This is true if the Voltage Set Point attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageSetPointESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StaticVarCompensatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStaticVarCompensator();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCapacitiveRating() {
        return capacitiveRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapacitiveRating( Float newCapacitiveRating ) {
        Float oldCapacitiveRating = capacitiveRating;
        capacitiveRating = newCapacitiveRating;
        boolean oldCapacitiveRatingESet = capacitiveRatingESet;
        capacitiveRatingESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING,
                        oldCapacitiveRating, capacitiveRating, !oldCapacitiveRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapacitiveRating() {
        Float oldCapacitiveRating = capacitiveRating;
        boolean oldCapacitiveRatingESet = capacitiveRatingESet;
        capacitiveRating = CAPACITIVE_RATING_EDEFAULT;
        capacitiveRatingESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING,
                        oldCapacitiveRating, CAPACITIVE_RATING_EDEFAULT, oldCapacitiveRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapacitiveRating() {
        return capacitiveRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInductiveRating() {
        return inductiveRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInductiveRating( Float newInductiveRating ) {
        Float oldInductiveRating = inductiveRating;
        inductiveRating = newInductiveRating;
        boolean oldInductiveRatingESet = inductiveRatingESet;
        inductiveRatingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING,
                    oldInductiveRating, inductiveRating, !oldInductiveRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInductiveRating() {
        Float oldInductiveRating = inductiveRating;
        boolean oldInductiveRatingESet = inductiveRatingESet;
        inductiveRating = INDUCTIVE_RATING_EDEFAULT;
        inductiveRatingESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING,
                        oldInductiveRating, INDUCTIVE_RATING_EDEFAULT, oldInductiveRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInductiveRating() {
        return inductiveRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ() {
        return q;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ( Float newQ ) {
        Float oldQ = q;
        q = newQ;
        boolean oldQESet = qESet;
        qESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STATIC_VAR_COMPENSATOR__Q, oldQ, q, !oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ() {
        Float oldQ = q;
        boolean oldQESet = qESet;
        q = Q_EDEFAULT;
        qESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STATIC_VAR_COMPENSATOR__Q, oldQ, Q_EDEFAULT, oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ() {
        return qESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSlope() {
        return slope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSlope( Float newSlope ) {
        Float oldSlope = slope;
        slope = newSlope;
        boolean oldSlopeESet = slopeESet;
        slopeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STATIC_VAR_COMPENSATOR__SLOPE, oldSlope, slope, !oldSlopeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSlope() {
        Float oldSlope = slope;
        boolean oldSlopeESet = slopeESet;
        slope = SLOPE_EDEFAULT;
        slopeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STATIC_VAR_COMPENSATOR__SLOPE, oldSlope, SLOPE_EDEFAULT, oldSlopeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSlope() {
        return slopeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SVCControlMode getSVCControlMode() {
        return sVCControlMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSVCControlMode( SVCControlMode newSVCControlMode ) {
        SVCControlMode oldSVCControlMode = sVCControlMode;
        sVCControlMode = newSVCControlMode == null ? SVC_CONTROL_MODE_EDEFAULT : newSVCControlMode;
        boolean oldSVCControlModeESet = sVCControlModeESet;
        sVCControlModeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE,
                    oldSVCControlMode, sVCControlMode, !oldSVCControlModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSVCControlMode() {
        SVCControlMode oldSVCControlMode = sVCControlMode;
        boolean oldSVCControlModeESet = sVCControlModeESet;
        sVCControlMode = SVC_CONTROL_MODE_EDEFAULT;
        sVCControlModeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE,
                        oldSVCControlMode, SVC_CONTROL_MODE_EDEFAULT, oldSVCControlModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSVCControlMode() {
        return sVCControlModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVoltageSetPoint() {
        return voltageSetPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageSetPoint( Float newVoltageSetPoint ) {
        Float oldVoltageSetPoint = voltageSetPoint;
        voltageSetPoint = newVoltageSetPoint;
        boolean oldVoltageSetPointESet = voltageSetPointESet;
        voltageSetPointESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT,
                        oldVoltageSetPoint, voltageSetPoint, !oldVoltageSetPointESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageSetPoint() {
        Float oldVoltageSetPoint = voltageSetPoint;
        boolean oldVoltageSetPointESet = voltageSetPointESet;
        voltageSetPoint = VOLTAGE_SET_POINT_EDEFAULT;
        voltageSetPointESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT,
                        oldVoltageSetPoint, VOLTAGE_SET_POINT_EDEFAULT, oldVoltageSetPointESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageSetPoint() {
        return voltageSetPointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
            return getCapacitiveRating();
        case CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
            return getInductiveRating();
        case CimPackage.STATIC_VAR_COMPENSATOR__Q:
            return getQ();
        case CimPackage.STATIC_VAR_COMPENSATOR__SLOPE:
            return getSlope();
        case CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
            return getSVCControlMode();
        case CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
            return getVoltageSetPoint();
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
        case CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
            setCapacitiveRating( ( Float ) newValue );
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
            setInductiveRating( ( Float ) newValue );
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__Q:
            setQ( ( Float ) newValue );
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__SLOPE:
            setSlope( ( Float ) newValue );
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
            setSVCControlMode( ( SVCControlMode ) newValue );
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
            setVoltageSetPoint( ( Float ) newValue );
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
        case CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
            unsetCapacitiveRating();
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
            unsetInductiveRating();
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__Q:
            unsetQ();
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__SLOPE:
            unsetSlope();
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
            unsetSVCControlMode();
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
            unsetVoltageSetPoint();
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
        case CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
            return isSetCapacitiveRating();
        case CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
            return isSetInductiveRating();
        case CimPackage.STATIC_VAR_COMPENSATOR__Q:
            return isSetQ();
        case CimPackage.STATIC_VAR_COMPENSATOR__SLOPE:
            return isSetSlope();
        case CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
            return isSetSVCControlMode();
        case CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
            return isSetVoltageSetPoint();
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
        result.append( " (capacitiveRating: " );
        if( capacitiveRatingESet )
            result.append( capacitiveRating );
        else
            result.append( "<unset>" );
        result.append( ", inductiveRating: " );
        if( inductiveRatingESet )
            result.append( inductiveRating );
        else
            result.append( "<unset>" );
        result.append( ", q: " );
        if( qESet )
            result.append( q );
        else
            result.append( "<unset>" );
        result.append( ", slope: " );
        if( slopeESet )
            result.append( slope );
        else
            result.append( "<unset>" );
        result.append( ", sVCControlMode: " );
        if( sVCControlModeESet )
            result.append( sVCControlMode );
        else
            result.append( "<unset>" );
        result.append( ", voltageSetPoint: " );
        if( voltageSetPointESet )
            result.append( voltageSetPoint );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StaticVarCompensatorImpl
