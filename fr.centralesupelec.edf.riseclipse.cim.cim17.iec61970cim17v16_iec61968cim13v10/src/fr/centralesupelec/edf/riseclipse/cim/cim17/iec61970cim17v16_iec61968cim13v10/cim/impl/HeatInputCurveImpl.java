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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heat Input Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HeatInputCurveImpl#getAuxPowerMult <em>Aux Power Mult</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HeatInputCurveImpl#getAuxPowerOffset <em>Aux Power Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HeatInputCurveImpl#getHeatInputEff <em>Heat Input Eff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HeatInputCurveImpl#getHeatInputOffset <em>Heat Input Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HeatInputCurveImpl#getIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HeatInputCurveImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeatInputCurveImpl extends CurveImpl implements HeatInputCurve {
    /**
     * The default value of the '{@link #getAuxPowerMult() <em>Aux Power Mult</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxPowerMult()
     * @generated
     * @ordered
     */
    protected static final Float AUX_POWER_MULT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuxPowerMult() <em>Aux Power Mult</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxPowerMult()
     * @generated
     * @ordered
     */
    protected Float auxPowerMult = AUX_POWER_MULT_EDEFAULT;

    /**
     * This is true if the Aux Power Mult attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean auxPowerMultESet;

    /**
     * The default value of the '{@link #getAuxPowerOffset() <em>Aux Power Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxPowerOffset()
     * @generated
     * @ordered
     */
    protected static final Float AUX_POWER_OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuxPowerOffset() <em>Aux Power Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxPowerOffset()
     * @generated
     * @ordered
     */
    protected Float auxPowerOffset = AUX_POWER_OFFSET_EDEFAULT;

    /**
     * This is true if the Aux Power Offset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean auxPowerOffsetESet;

    /**
     * The default value of the '{@link #getHeatInputEff() <em>Heat Input Eff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatInputEff()
     * @generated
     * @ordered
     */
    protected static final Float HEAT_INPUT_EFF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHeatInputEff() <em>Heat Input Eff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatInputEff()
     * @generated
     * @ordered
     */
    protected Float heatInputEff = HEAT_INPUT_EFF_EDEFAULT;

    /**
     * This is true if the Heat Input Eff attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean heatInputEffESet;

    /**
     * The default value of the '{@link #getHeatInputOffset() <em>Heat Input Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatInputOffset()
     * @generated
     * @ordered
     */
    protected static final Float HEAT_INPUT_OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHeatInputOffset() <em>Heat Input Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatInputOffset()
     * @generated
     * @ordered
     */
    protected Float heatInputOffset = HEAT_INPUT_OFFSET_EDEFAULT;

    /**
     * This is true if the Heat Input Offset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean heatInputOffsetESet;

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
    protected HeatInputCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHeatInputCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAuxPowerMult() {
        return auxPowerMult;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAuxPowerMult( Float newAuxPowerMult ) {
        Float oldAuxPowerMult = auxPowerMult;
        auxPowerMult = newAuxPowerMult;
        boolean oldAuxPowerMultESet = auxPowerMultESet;
        auxPowerMultESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT, oldAuxPowerMult, auxPowerMult, !oldAuxPowerMultESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuxPowerMult() {
        Float oldAuxPowerMult = auxPowerMult;
        boolean oldAuxPowerMultESet = auxPowerMultESet;
        auxPowerMult = AUX_POWER_MULT_EDEFAULT;
        auxPowerMultESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT,
                    oldAuxPowerMult, AUX_POWER_MULT_EDEFAULT, oldAuxPowerMultESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxPowerMult() {
        return auxPowerMultESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAuxPowerOffset() {
        return auxPowerOffset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAuxPowerOffset( Float newAuxPowerOffset ) {
        Float oldAuxPowerOffset = auxPowerOffset;
        auxPowerOffset = newAuxPowerOffset;
        boolean oldAuxPowerOffsetESet = auxPowerOffsetESet;
        auxPowerOffsetESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET,
                    oldAuxPowerOffset, auxPowerOffset, !oldAuxPowerOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuxPowerOffset() {
        Float oldAuxPowerOffset = auxPowerOffset;
        boolean oldAuxPowerOffsetESet = auxPowerOffsetESet;
        auxPowerOffset = AUX_POWER_OFFSET_EDEFAULT;
        auxPowerOffsetESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET,
                    oldAuxPowerOffset, AUX_POWER_OFFSET_EDEFAULT, oldAuxPowerOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxPowerOffset() {
        return auxPowerOffsetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHeatInputEff() {
        return heatInputEff;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeatInputEff( Float newHeatInputEff ) {
        Float oldHeatInputEff = heatInputEff;
        heatInputEff = newHeatInputEff;
        boolean oldHeatInputEffESet = heatInputEffESet;
        heatInputEffESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF, oldHeatInputEff, heatInputEff, !oldHeatInputEffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHeatInputEff() {
        Float oldHeatInputEff = heatInputEff;
        boolean oldHeatInputEffESet = heatInputEffESet;
        heatInputEff = HEAT_INPUT_EFF_EDEFAULT;
        heatInputEffESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF,
                    oldHeatInputEff, HEAT_INPUT_EFF_EDEFAULT, oldHeatInputEffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHeatInputEff() {
        return heatInputEffESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHeatInputOffset() {
        return heatInputOffset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeatInputOffset( Float newHeatInputOffset ) {
        Float oldHeatInputOffset = heatInputOffset;
        heatInputOffset = newHeatInputOffset;
        boolean oldHeatInputOffsetESet = heatInputOffsetESet;
        heatInputOffsetESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET,
                    oldHeatInputOffset, heatInputOffset, !oldHeatInputOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHeatInputOffset() {
        Float oldHeatInputOffset = heatInputOffset;
        boolean oldHeatInputOffsetESet = heatInputOffsetESet;
        heatInputOffset = HEAT_INPUT_OFFSET_EDEFAULT;
        heatInputOffsetESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET,
                    oldHeatInputOffset, HEAT_INPUT_OFFSET_EDEFAULT, oldHeatInputOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHeatInputOffset() {
        return heatInputOffsetESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P, oldIsNetGrossP, isNetGrossP, !oldIsNetGrossPESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P,
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
                    CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit,
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
                        CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, ThermalGeneratingUnit.class, msgs );
            if( newThermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) newThermalGeneratingUnit ).eInverseAdd( this,
                        CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, ThermalGeneratingUnit.class, msgs );
            msgs = basicSetThermalGeneratingUnit( newThermalGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT,
                            newThermalGeneratingUnit, newThermalGeneratingUnit, !oldThermalGeneratingUnitESet ) );
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
                    CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, null,
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
                    CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, ThermalGeneratingUnit.class, msgs );
            msgs = basicUnsetThermalGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, null, null, oldThermalGeneratingUnitESet ) );
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
        case CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, ThermalGeneratingUnit.class, msgs );
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
        case CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
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
        case CimPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
            return getAuxPowerMult();
        case CimPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
            return getAuxPowerOffset();
        case CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
            return getHeatInputEff();
        case CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
            return getHeatInputOffset();
        case CimPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
            return getIsNetGrossP();
        case CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
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
        case CimPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
            setAuxPowerMult( ( Float ) newValue );
            return;
        case CimPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
            setAuxPowerOffset( ( Float ) newValue );
            return;
        case CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
            setHeatInputEff( ( Float ) newValue );
            return;
        case CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
            setHeatInputOffset( ( Float ) newValue );
            return;
        case CimPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
            setIsNetGrossP( ( Boolean ) newValue );
            return;
        case CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
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
        case CimPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
            unsetAuxPowerMult();
            return;
        case CimPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
            unsetAuxPowerOffset();
            return;
        case CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
            unsetHeatInputEff();
            return;
        case CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
            unsetHeatInputOffset();
            return;
        case CimPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
            unsetIsNetGrossP();
            return;
        case CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
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
        case CimPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
            return isSetAuxPowerMult();
        case CimPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
            return isSetAuxPowerOffset();
        case CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
            return isSetHeatInputEff();
        case CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
            return isSetHeatInputOffset();
        case CimPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
            return isSetIsNetGrossP();
        case CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
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
        result.append( " (auxPowerMult: " );
        if( auxPowerMultESet )
            result.append( auxPowerMult );
        else
            result.append( "<unset>" );
        result.append( ", auxPowerOffset: " );
        if( auxPowerOffsetESet )
            result.append( auxPowerOffset );
        else
            result.append( "<unset>" );
        result.append( ", heatInputEff: " );
        if( heatInputEffESet )
            result.append( heatInputEff );
        else
            result.append( "<unset>" );
        result.append( ", heatInputOffset: " );
        if( heatInputOffsetESet )
            result.append( heatInputOffset );
        else
            result.append( "<unset>" );
        result.append( ", isNetGrossP: " );
        if( isNetGrossPESet )
            result.append( isNetGrossP );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //HeatInputCurveImpl
