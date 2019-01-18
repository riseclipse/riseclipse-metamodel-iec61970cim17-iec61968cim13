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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SeriesCompensator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Series Compensator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeriesCompensatorImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeriesCompensatorImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeriesCompensatorImpl#getVaristorPresent <em>Varistor Present</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeriesCompensatorImpl#getVaristorRatedCurrent <em>Varistor Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeriesCompensatorImpl#getVaristorVoltageThreshold <em>Varistor Voltage Threshold</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeriesCompensatorImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeriesCompensatorImpl#getX0 <em>X0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeriesCompensatorImpl extends ConductingEquipmentImpl implements SeriesCompensator {
    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Float R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Float r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected static final Float R0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected Float r0 = R0_EDEFAULT;

    /**
     * This is true if the R0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r0ESet;

    /**
     * The default value of the '{@link #getVaristorPresent() <em>Varistor Present</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVaristorPresent()
     * @generated
     * @ordered
     */
    protected static final Boolean VARISTOR_PRESENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVaristorPresent() <em>Varistor Present</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVaristorPresent()
     * @generated
     * @ordered
     */
    protected Boolean varistorPresent = VARISTOR_PRESENT_EDEFAULT;

    /**
     * This is true if the Varistor Present attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean varistorPresentESet;

    /**
     * The default value of the '{@link #getVaristorRatedCurrent() <em>Varistor Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVaristorRatedCurrent()
     * @generated
     * @ordered
     */
    protected static final Float VARISTOR_RATED_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVaristorRatedCurrent() <em>Varistor Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVaristorRatedCurrent()
     * @generated
     * @ordered
     */
    protected Float varistorRatedCurrent = VARISTOR_RATED_CURRENT_EDEFAULT;

    /**
     * This is true if the Varistor Rated Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean varistorRatedCurrentESet;

    /**
     * The default value of the '{@link #getVaristorVoltageThreshold() <em>Varistor Voltage Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVaristorVoltageThreshold()
     * @generated
     * @ordered
     */
    protected static final Float VARISTOR_VOLTAGE_THRESHOLD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVaristorVoltageThreshold() <em>Varistor Voltage Threshold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVaristorVoltageThreshold()
     * @generated
     * @ordered
     */
    protected Float varistorVoltageThreshold = VARISTOR_VOLTAGE_THRESHOLD_EDEFAULT;

    /**
     * This is true if the Varistor Voltage Threshold attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean varistorVoltageThresholdESet;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final Float X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected Float x = X_EDEFAULT;

    /**
     * This is true if the X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xESet;

    /**
     * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected static final Float X0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected Float x0 = X0_EDEFAULT;

    /**
     * This is true if the X0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x0ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SeriesCompensatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSeriesCompensator();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Float newR ) {
        Float oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SERIES_COMPENSATOR__R, oldR, r, !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Float oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SERIES_COMPENSATOR__R, oldR, R_EDEFAULT, oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR0() {
        return r0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR0( Float newR0 ) {
        Float oldR0 = r0;
        r0 = newR0;
        boolean oldR0ESet = r0ESet;
        r0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SERIES_COMPENSATOR__R0, oldR0, r0, !oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR0() {
        Float oldR0 = r0;
        boolean oldR0ESet = r0ESet;
        r0 = R0_EDEFAULT;
        r0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SERIES_COMPENSATOR__R0, oldR0, R0_EDEFAULT, oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR0() {
        return r0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getVaristorPresent() {
        return varistorPresent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVaristorPresent( Boolean newVaristorPresent ) {
        Boolean oldVaristorPresent = varistorPresent;
        varistorPresent = newVaristorPresent;
        boolean oldVaristorPresentESet = varistorPresentESet;
        varistorPresentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SERIES_COMPENSATOR__VARISTOR_PRESENT,
                    oldVaristorPresent, varistorPresent, !oldVaristorPresentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVaristorPresent() {
        Boolean oldVaristorPresent = varistorPresent;
        boolean oldVaristorPresentESet = varistorPresentESet;
        varistorPresent = VARISTOR_PRESENT_EDEFAULT;
        varistorPresentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SERIES_COMPENSATOR__VARISTOR_PRESENT,
                    oldVaristorPresent, VARISTOR_PRESENT_EDEFAULT, oldVaristorPresentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVaristorPresent() {
        return varistorPresentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVaristorRatedCurrent() {
        return varistorRatedCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVaristorRatedCurrent( Float newVaristorRatedCurrent ) {
        Float oldVaristorRatedCurrent = varistorRatedCurrent;
        varistorRatedCurrent = newVaristorRatedCurrent;
        boolean oldVaristorRatedCurrentESet = varistorRatedCurrentESet;
        varistorRatedCurrentESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SERIES_COMPENSATOR__VARISTOR_RATED_CURRENT,
                        oldVaristorRatedCurrent, varistorRatedCurrent, !oldVaristorRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVaristorRatedCurrent() {
        Float oldVaristorRatedCurrent = varistorRatedCurrent;
        boolean oldVaristorRatedCurrentESet = varistorRatedCurrentESet;
        varistorRatedCurrent = VARISTOR_RATED_CURRENT_EDEFAULT;
        varistorRatedCurrentESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SERIES_COMPENSATOR__VARISTOR_RATED_CURRENT,
                        oldVaristorRatedCurrent, VARISTOR_RATED_CURRENT_EDEFAULT, oldVaristorRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVaristorRatedCurrent() {
        return varistorRatedCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVaristorVoltageThreshold() {
        return varistorVoltageThreshold;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVaristorVoltageThreshold( Float newVaristorVoltageThreshold ) {
        Float oldVaristorVoltageThreshold = varistorVoltageThreshold;
        varistorVoltageThreshold = newVaristorVoltageThreshold;
        boolean oldVaristorVoltageThresholdESet = varistorVoltageThresholdESet;
        varistorVoltageThresholdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SERIES_COMPENSATOR__VARISTOR_VOLTAGE_THRESHOLD, oldVaristorVoltageThreshold,
                varistorVoltageThreshold, !oldVaristorVoltageThresholdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVaristorVoltageThreshold() {
        Float oldVaristorVoltageThreshold = varistorVoltageThreshold;
        boolean oldVaristorVoltageThresholdESet = varistorVoltageThresholdESet;
        varistorVoltageThreshold = VARISTOR_VOLTAGE_THRESHOLD_EDEFAULT;
        varistorVoltageThresholdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SERIES_COMPENSATOR__VARISTOR_VOLTAGE_THRESHOLD, oldVaristorVoltageThreshold,
                VARISTOR_VOLTAGE_THRESHOLD_EDEFAULT, oldVaristorVoltageThresholdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVaristorVoltageThreshold() {
        return varistorVoltageThresholdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX( Float newX ) {
        Float oldX = x;
        x = newX;
        boolean oldXESet = xESet;
        xESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SERIES_COMPENSATOR__X, oldX, x, !oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX() {
        Float oldX = x;
        boolean oldXESet = xESet;
        x = X_EDEFAULT;
        xESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SERIES_COMPENSATOR__X, oldX, X_EDEFAULT, oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX() {
        return xESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX0() {
        return x0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX0( Float newX0 ) {
        Float oldX0 = x0;
        x0 = newX0;
        boolean oldX0ESet = x0ESet;
        x0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SERIES_COMPENSATOR__X0, oldX0, x0, !oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX0() {
        Float oldX0 = x0;
        boolean oldX0ESet = x0ESet;
        x0 = X0_EDEFAULT;
        x0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SERIES_COMPENSATOR__X0, oldX0, X0_EDEFAULT, oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX0() {
        return x0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.SERIES_COMPENSATOR__R:
            return getR();
        case CimPackage.SERIES_COMPENSATOR__R0:
            return getR0();
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_PRESENT:
            return getVaristorPresent();
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_RATED_CURRENT:
            return getVaristorRatedCurrent();
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_VOLTAGE_THRESHOLD:
            return getVaristorVoltageThreshold();
        case CimPackage.SERIES_COMPENSATOR__X:
            return getX();
        case CimPackage.SERIES_COMPENSATOR__X0:
            return getX0();
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
        case CimPackage.SERIES_COMPENSATOR__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.SERIES_COMPENSATOR__R0:
            setR0( ( Float ) newValue );
            return;
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_PRESENT:
            setVaristorPresent( ( Boolean ) newValue );
            return;
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_RATED_CURRENT:
            setVaristorRatedCurrent( ( Float ) newValue );
            return;
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_VOLTAGE_THRESHOLD:
            setVaristorVoltageThreshold( ( Float ) newValue );
            return;
        case CimPackage.SERIES_COMPENSATOR__X:
            setX( ( Float ) newValue );
            return;
        case CimPackage.SERIES_COMPENSATOR__X0:
            setX0( ( Float ) newValue );
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
        case CimPackage.SERIES_COMPENSATOR__R:
            unsetR();
            return;
        case CimPackage.SERIES_COMPENSATOR__R0:
            unsetR0();
            return;
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_PRESENT:
            unsetVaristorPresent();
            return;
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_RATED_CURRENT:
            unsetVaristorRatedCurrent();
            return;
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_VOLTAGE_THRESHOLD:
            unsetVaristorVoltageThreshold();
            return;
        case CimPackage.SERIES_COMPENSATOR__X:
            unsetX();
            return;
        case CimPackage.SERIES_COMPENSATOR__X0:
            unsetX0();
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
        case CimPackage.SERIES_COMPENSATOR__R:
            return isSetR();
        case CimPackage.SERIES_COMPENSATOR__R0:
            return isSetR0();
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_PRESENT:
            return isSetVaristorPresent();
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_RATED_CURRENT:
            return isSetVaristorRatedCurrent();
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_VOLTAGE_THRESHOLD:
            return isSetVaristorVoltageThreshold();
        case CimPackage.SERIES_COMPENSATOR__X:
            return isSetX();
        case CimPackage.SERIES_COMPENSATOR__X0:
            return isSetX0();
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
        result.append( " (r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ", varistorPresent: " );
        if( varistorPresentESet )
            result.append( varistorPresent );
        else
            result.append( "<unset>" );
        result.append( ", varistorRatedCurrent: " );
        if( varistorRatedCurrentESet )
            result.append( varistorRatedCurrent );
        else
            result.append( "<unset>" );
        result.append( ", varistorVoltageThreshold: " );
        if( varistorVoltageThresholdESet )
            result.append( varistorVoltageThreshold );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SeriesCompensatorImpl
