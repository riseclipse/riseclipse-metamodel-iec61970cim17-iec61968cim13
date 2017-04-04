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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Currency;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accounting Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountingUnitImpl#getEnergyUnit <em>Energy Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountingUnitImpl#getMonetaryUnit <em>Monetary Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountingUnitImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccountingUnitImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountingUnitImpl extends MinimalEObjectImpl.Container implements AccountingUnit {
    /**
     * The default value of the '{@link #getEnergyUnit() <em>Energy Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyUnit()
     * @generated
     * @ordered
     */
    protected static final Float ENERGY_UNIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergyUnit() <em>Energy Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyUnit()
     * @generated
     * @ordered
     */
    protected Float energyUnit = ENERGY_UNIT_EDEFAULT;

    /**
     * This is true if the Energy Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energyUnitESet;

    /**
     * The default value of the '{@link #getMonetaryUnit() <em>Monetary Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonetaryUnit()
     * @generated
     * @ordered
     */
    protected static final Currency MONETARY_UNIT_EDEFAULT = Currency.AED;

    /**
     * The cached value of the '{@link #getMonetaryUnit() <em>Monetary Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonetaryUnit()
     * @generated
     * @ordered
     */
    protected Currency monetaryUnit = MONETARY_UNIT_EDEFAULT;

    /**
     * This is true if the Monetary Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean monetaryUnitESet;

    /**
     * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected static final UnitMultiplier MULTIPLIER_EDEFAULT = UnitMultiplier.YOCTO;

    /**
     * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected UnitMultiplier multiplier = MULTIPLIER_EDEFAULT;

    /**
     * This is true if the Multiplier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean multiplierESet;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final Float VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Float value = VALUE_EDEFAULT;

    /**
     * This is true if the Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccountingUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAccountingUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEnergyUnit() {
        return energyUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergyUnit( Float newEnergyUnit ) {
        Float oldEnergyUnit = energyUnit;
        energyUnit = newEnergyUnit;
        boolean oldEnergyUnitESet = energyUnitESet;
        energyUnitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCOUNTING_UNIT__ENERGY_UNIT, oldEnergyUnit, energyUnit, !oldEnergyUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyUnit() {
        Float oldEnergyUnit = energyUnit;
        boolean oldEnergyUnitESet = energyUnitESet;
        energyUnit = ENERGY_UNIT_EDEFAULT;
        energyUnitESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACCOUNTING_UNIT__ENERGY_UNIT, oldEnergyUnit, ENERGY_UNIT_EDEFAULT, oldEnergyUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyUnit() {
        return energyUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Currency getMonetaryUnit() {
        return monetaryUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMonetaryUnit( Currency newMonetaryUnit ) {
        Currency oldMonetaryUnit = monetaryUnit;
        monetaryUnit = newMonetaryUnit == null ? MONETARY_UNIT_EDEFAULT : newMonetaryUnit;
        boolean oldMonetaryUnitESet = monetaryUnitESet;
        monetaryUnitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCOUNTING_UNIT__MONETARY_UNIT, oldMonetaryUnit, monetaryUnit, !oldMonetaryUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMonetaryUnit() {
        Currency oldMonetaryUnit = monetaryUnit;
        boolean oldMonetaryUnitESet = monetaryUnitESet;
        monetaryUnit = MONETARY_UNIT_EDEFAULT;
        monetaryUnitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ACCOUNTING_UNIT__MONETARY_UNIT,
                    oldMonetaryUnit, MONETARY_UNIT_EDEFAULT, oldMonetaryUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMonetaryUnit() {
        return monetaryUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitMultiplier getMultiplier() {
        return multiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMultiplier( UnitMultiplier newMultiplier ) {
        UnitMultiplier oldMultiplier = multiplier;
        multiplier = newMultiplier == null ? MULTIPLIER_EDEFAULT : newMultiplier;
        boolean oldMultiplierESet = multiplierESet;
        multiplierESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCOUNTING_UNIT__MULTIPLIER, oldMultiplier, multiplier, !oldMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMultiplier() {
        UnitMultiplier oldMultiplier = multiplier;
        boolean oldMultiplierESet = multiplierESet;
        multiplier = MULTIPLIER_EDEFAULT;
        multiplierESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACCOUNTING_UNIT__MULTIPLIER, oldMultiplier, MULTIPLIER_EDEFAULT, oldMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMultiplier() {
        return multiplierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( Float newValue ) {
        Float oldValue = value;
        value = newValue;
        boolean oldValueESet = valueESet;
        valueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCOUNTING_UNIT__VALUE, oldValue, value, !oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue() {
        Float oldValue = value;
        boolean oldValueESet = valueESet;
        value = VALUE_EDEFAULT;
        valueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACCOUNTING_UNIT__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue() {
        return valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
            return getEnergyUnit();
        case CimPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
            return getMonetaryUnit();
        case CimPackage.ACCOUNTING_UNIT__MULTIPLIER:
            return getMultiplier();
        case CimPackage.ACCOUNTING_UNIT__VALUE:
            return getValue();
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
        case CimPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
            setEnergyUnit( ( Float ) newValue );
            return;
        case CimPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
            setMonetaryUnit( ( Currency ) newValue );
            return;
        case CimPackage.ACCOUNTING_UNIT__MULTIPLIER:
            setMultiplier( ( UnitMultiplier ) newValue );
            return;
        case CimPackage.ACCOUNTING_UNIT__VALUE:
            setValue( ( Float ) newValue );
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
        case CimPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
            unsetEnergyUnit();
            return;
        case CimPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
            unsetMonetaryUnit();
            return;
        case CimPackage.ACCOUNTING_UNIT__MULTIPLIER:
            unsetMultiplier();
            return;
        case CimPackage.ACCOUNTING_UNIT__VALUE:
            unsetValue();
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
        case CimPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
            return isSetEnergyUnit();
        case CimPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
            return isSetMonetaryUnit();
        case CimPackage.ACCOUNTING_UNIT__MULTIPLIER:
            return isSetMultiplier();
        case CimPackage.ACCOUNTING_UNIT__VALUE:
            return isSetValue();
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
        result.append( " (energyUnit: " );
        if( energyUnitESet )
            result.append( energyUnit );
        else
            result.append( "<unset>" );
        result.append( ", monetaryUnit: " );
        if( monetaryUnitESet )
            result.append( monetaryUnit );
        else
            result.append( "<unset>" );
        result.append( ", multiplier: " );
        if( multiplierESet )
            result.append( multiplier );
        else
            result.append( "<unset>" );
        result.append( ", value: " );
        if( valueESet )
            result.append( value );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AccountingUnitImpl
