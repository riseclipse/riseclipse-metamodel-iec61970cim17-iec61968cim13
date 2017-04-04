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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncrementalHeatRateCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incremental Heat Rate Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncrementalHeatRateCurveImpl#getIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncrementalHeatRateCurveImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncrementalHeatRateCurveImpl extends CurveImpl implements IncrementalHeatRateCurve {
    /**
     * The default value of the '{@link #getIsNetGrossP() <em>Is Net Gross P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsNetGrossP()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_NET_GROSS_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsNetGrossP() <em>Is Net Gross P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsNetGrossP()
     * @generated
     * @ordered
     */
    protected Boolean isNetGrossP = IS_NET_GROSS_P_EDEFAULT;

    /**
     * This is true if the Is Net Gross P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isNetGrossPESet;

    /**
     * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThermalGeneratingUnit()
     * @generated
     * @ordered
     */
    protected ThermalGeneratingUnit thermalGeneratingUnit;

    /**
     * This is true if the Thermal Generating Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thermalGeneratingUnitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IncrementalHeatRateCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getIncrementalHeatRateCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsNetGrossP() {
        return isNetGrossP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsNetGrossP( Boolean newIsNetGrossP ) {
        Boolean oldIsNetGrossP = isNetGrossP;
        isNetGrossP = newIsNetGrossP;
        boolean oldIsNetGrossPESet = isNetGrossPESet;
        isNetGrossPESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.INCREMENTAL_HEAT_RATE_CURVE__IS_NET_GROSS_P,
                        oldIsNetGrossP, isNetGrossP, !oldIsNetGrossPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsNetGrossP() {
        Boolean oldIsNetGrossP = isNetGrossP;
        boolean oldIsNetGrossPESet = isNetGrossPESet;
        isNetGrossP = IS_NET_GROSS_P_EDEFAULT;
        isNetGrossPESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.INCREMENTAL_HEAT_RATE_CURVE__IS_NET_GROSS_P,
                        oldIsNetGrossP, IS_NET_GROSS_P_EDEFAULT, oldIsNetGrossPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsNetGrossP() {
        return isNetGrossPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ThermalGeneratingUnit getThermalGeneratingUnit() {
        return thermalGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThermalGeneratingUnit( ThermalGeneratingUnit newThermalGeneratingUnit,
            NotificationChain msgs ) {
        ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
        thermalGeneratingUnit = newThermalGeneratingUnit;
        boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
        thermalGeneratingUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit,
                    newThermalGeneratingUnit, !oldThermalGeneratingUnitESet );
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
    public void setThermalGeneratingUnit( ThermalGeneratingUnit newThermalGeneratingUnit ) {
        if( newThermalGeneratingUnit != thermalGeneratingUnit ) {
            NotificationChain msgs = null;
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, ThermalGeneratingUnit.class,
                        msgs );
            if( newThermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) newThermalGeneratingUnit ).eInverseAdd( this,
                        CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, ThermalGeneratingUnit.class,
                        msgs );
            msgs = basicSetThermalGeneratingUnit( newThermalGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, newThermalGeneratingUnit,
                    newThermalGeneratingUnit, !oldThermalGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetThermalGeneratingUnit( NotificationChain msgs ) {
        ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
        thermalGeneratingUnit = null;
        boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
        thermalGeneratingUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, null,
                    oldThermalGeneratingUnitESet );
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
    public void unsetThermalGeneratingUnit() {
        if( thermalGeneratingUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                    CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, ThermalGeneratingUnit.class,
                    msgs );
            msgs = basicUnsetThermalGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, null, null,
                    oldThermalGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalGeneratingUnit() {
        return thermalGeneratingUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT:
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, ThermalGeneratingUnit.class,
                        msgs );
            return basicSetThermalGeneratingUnit( ( ThermalGeneratingUnit ) otherEnd, msgs );
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
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT:
            return basicUnsetThermalGeneratingUnit( msgs );
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
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE__IS_NET_GROSS_P:
            return getIsNetGrossP();
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT:
            return getThermalGeneratingUnit();
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
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE__IS_NET_GROSS_P:
            setIsNetGrossP( ( Boolean ) newValue );
            return;
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT:
            setThermalGeneratingUnit( ( ThermalGeneratingUnit ) newValue );
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
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE__IS_NET_GROSS_P:
            unsetIsNetGrossP();
            return;
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT:
            unsetThermalGeneratingUnit();
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
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE__IS_NET_GROSS_P:
            return isSetIsNetGrossP();
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT:
            return isSetThermalGeneratingUnit();
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
        result.append( " (isNetGrossP: " );
        if( isNetGrossPESet )
            result.append( isNetGrossP );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //IncrementalHeatRateCurveImpl
