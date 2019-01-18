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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Response Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getExponentModel <em>Exponent Model</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getPConstantCurrent <em>PConstant Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getPConstantImpedance <em>PConstant Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getPConstantPower <em>PConstant Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getPFrequencyExponent <em>PFrequency Exponent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getPVoltageExponent <em>PVoltage Exponent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getQConstantCurrent <em>QConstant Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getQConstantImpedance <em>QConstant Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getQConstantPower <em>QConstant Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getQFrequencyExponent <em>QFrequency Exponent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getQVoltageExponent <em>QVoltage Exponent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadResponseCharacteristicImpl#getEnergyConsumer <em>Energy Consumer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadResponseCharacteristicImpl extends IdentifiedObjectImpl implements LoadResponseCharacteristic {
    /**
     * The default value of the '{@link #getExponentModel() <em>Exponent Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExponentModel()
     * @generated
     * @ordered
     */
    protected static final Boolean EXPONENT_MODEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExponentModel() <em>Exponent Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExponentModel()
     * @generated
     * @ordered
     */
    protected Boolean exponentModel = EXPONENT_MODEL_EDEFAULT;

    /**
     * This is true if the Exponent Model attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean exponentModelESet;

    /**
     * The default value of the '{@link #getPConstantCurrent() <em>PConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPConstantCurrent()
     * @generated
     * @ordered
     */
    protected static final Float PCONSTANT_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPConstantCurrent() <em>PConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPConstantCurrent()
     * @generated
     * @ordered
     */
    protected Float pConstantCurrent = PCONSTANT_CURRENT_EDEFAULT;

    /**
     * This is true if the PConstant Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pConstantCurrentESet;

    /**
     * The default value of the '{@link #getPConstantImpedance() <em>PConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPConstantImpedance()
     * @generated
     * @ordered
     */
    protected static final Float PCONSTANT_IMPEDANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPConstantImpedance() <em>PConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPConstantImpedance()
     * @generated
     * @ordered
     */
    protected Float pConstantImpedance = PCONSTANT_IMPEDANCE_EDEFAULT;

    /**
     * This is true if the PConstant Impedance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pConstantImpedanceESet;

    /**
     * The default value of the '{@link #getPConstantPower() <em>PConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPConstantPower()
     * @generated
     * @ordered
     */
    protected static final Float PCONSTANT_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPConstantPower() <em>PConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPConstantPower()
     * @generated
     * @ordered
     */
    protected Float pConstantPower = PCONSTANT_POWER_EDEFAULT;

    /**
     * This is true if the PConstant Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pConstantPowerESet;

    /**
     * The default value of the '{@link #getPFrequencyExponent() <em>PFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPFrequencyExponent()
     * @generated
     * @ordered
     */
    protected static final Float PFREQUENCY_EXPONENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPFrequencyExponent() <em>PFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPFrequencyExponent()
     * @generated
     * @ordered
     */
    protected Float pFrequencyExponent = PFREQUENCY_EXPONENT_EDEFAULT;

    /**
     * This is true if the PFrequency Exponent attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pFrequencyExponentESet;

    /**
     * The default value of the '{@link #getPVoltageExponent() <em>PVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPVoltageExponent()
     * @generated
     * @ordered
     */
    protected static final Float PVOLTAGE_EXPONENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPVoltageExponent() <em>PVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPVoltageExponent()
     * @generated
     * @ordered
     */
    protected Float pVoltageExponent = PVOLTAGE_EXPONENT_EDEFAULT;

    /**
     * This is true if the PVoltage Exponent attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pVoltageExponentESet;

    /**
     * The default value of the '{@link #getQConstantCurrent() <em>QConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQConstantCurrent()
     * @generated
     * @ordered
     */
    protected static final Float QCONSTANT_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQConstantCurrent() <em>QConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQConstantCurrent()
     * @generated
     * @ordered
     */
    protected Float qConstantCurrent = QCONSTANT_CURRENT_EDEFAULT;

    /**
     * This is true if the QConstant Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qConstantCurrentESet;

    /**
     * The default value of the '{@link #getQConstantImpedance() <em>QConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQConstantImpedance()
     * @generated
     * @ordered
     */
    protected static final Float QCONSTANT_IMPEDANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQConstantImpedance() <em>QConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQConstantImpedance()
     * @generated
     * @ordered
     */
    protected Float qConstantImpedance = QCONSTANT_IMPEDANCE_EDEFAULT;

    /**
     * This is true if the QConstant Impedance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qConstantImpedanceESet;

    /**
     * The default value of the '{@link #getQConstantPower() <em>QConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQConstantPower()
     * @generated
     * @ordered
     */
    protected static final Float QCONSTANT_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQConstantPower() <em>QConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQConstantPower()
     * @generated
     * @ordered
     */
    protected Float qConstantPower = QCONSTANT_POWER_EDEFAULT;

    /**
     * This is true if the QConstant Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qConstantPowerESet;

    /**
     * The default value of the '{@link #getQFrequencyExponent() <em>QFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQFrequencyExponent()
     * @generated
     * @ordered
     */
    protected static final Float QFREQUENCY_EXPONENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQFrequencyExponent() <em>QFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQFrequencyExponent()
     * @generated
     * @ordered
     */
    protected Float qFrequencyExponent = QFREQUENCY_EXPONENT_EDEFAULT;

    /**
     * This is true if the QFrequency Exponent attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qFrequencyExponentESet;

    /**
     * The default value of the '{@link #getQVoltageExponent() <em>QVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQVoltageExponent()
     * @generated
     * @ordered
     */
    protected static final Float QVOLTAGE_EXPONENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQVoltageExponent() <em>QVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQVoltageExponent()
     * @generated
     * @ordered
     */
    protected Float qVoltageExponent = QVOLTAGE_EXPONENT_EDEFAULT;

    /**
     * This is true if the QVoltage Exponent attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qVoltageExponentESet;

    /**
     * The cached value of the '{@link #getEnergyConsumer() <em>Energy Consumer</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyConsumer()
     * @generated
     * @ordered
     */
    protected EList< EnergyConsumer > energyConsumer;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoadResponseCharacteristicImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLoadResponseCharacteristic();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getExponentModel() {
        return exponentModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExponentModel( Boolean newExponentModel ) {
        Boolean oldExponentModel = exponentModel;
        exponentModel = newExponentModel;
        boolean oldExponentModelESet = exponentModelESet;
        exponentModelESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL,
                        oldExponentModel, exponentModel, !oldExponentModelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExponentModel() {
        Boolean oldExponentModel = exponentModel;
        boolean oldExponentModelESet = exponentModelESet;
        exponentModel = EXPONENT_MODEL_EDEFAULT;
        exponentModelESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL, oldExponentModel, EXPONENT_MODEL_EDEFAULT,
                oldExponentModelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExponentModel() {
        return exponentModelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPConstantCurrent() {
        return pConstantCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPConstantCurrent( Float newPConstantCurrent ) {
        Float oldPConstantCurrent = pConstantCurrent;
        pConstantCurrent = newPConstantCurrent;
        boolean oldPConstantCurrentESet = pConstantCurrentESet;
        pConstantCurrentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT, oldPConstantCurrent, pConstantCurrent,
                !oldPConstantCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPConstantCurrent() {
        Float oldPConstantCurrent = pConstantCurrent;
        boolean oldPConstantCurrentESet = pConstantCurrentESet;
        pConstantCurrent = PCONSTANT_CURRENT_EDEFAULT;
        pConstantCurrentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT, oldPConstantCurrent,
                PCONSTANT_CURRENT_EDEFAULT, oldPConstantCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPConstantCurrent() {
        return pConstantCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPConstantImpedance() {
        return pConstantImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPConstantImpedance( Float newPConstantImpedance ) {
        Float oldPConstantImpedance = pConstantImpedance;
        pConstantImpedance = newPConstantImpedance;
        boolean oldPConstantImpedanceESet = pConstantImpedanceESet;
        pConstantImpedanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE, oldPConstantImpedance, pConstantImpedance,
                !oldPConstantImpedanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPConstantImpedance() {
        Float oldPConstantImpedance = pConstantImpedance;
        boolean oldPConstantImpedanceESet = pConstantImpedanceESet;
        pConstantImpedance = PCONSTANT_IMPEDANCE_EDEFAULT;
        pConstantImpedanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE, oldPConstantImpedance,
                PCONSTANT_IMPEDANCE_EDEFAULT, oldPConstantImpedanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPConstantImpedance() {
        return pConstantImpedanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPConstantPower() {
        return pConstantPower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPConstantPower( Float newPConstantPower ) {
        Float oldPConstantPower = pConstantPower;
        pConstantPower = newPConstantPower;
        boolean oldPConstantPowerESet = pConstantPowerESet;
        pConstantPowerESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER,
                        oldPConstantPower, pConstantPower, !oldPConstantPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPConstantPower() {
        Float oldPConstantPower = pConstantPower;
        boolean oldPConstantPowerESet = pConstantPowerESet;
        pConstantPower = PCONSTANT_POWER_EDEFAULT;
        pConstantPowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER, oldPConstantPower, PCONSTANT_POWER_EDEFAULT,
                oldPConstantPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPConstantPower() {
        return pConstantPowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPFrequencyExponent() {
        return pFrequencyExponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPFrequencyExponent( Float newPFrequencyExponent ) {
        Float oldPFrequencyExponent = pFrequencyExponent;
        pFrequencyExponent = newPFrequencyExponent;
        boolean oldPFrequencyExponentESet = pFrequencyExponentESet;
        pFrequencyExponentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT, oldPFrequencyExponent, pFrequencyExponent,
                !oldPFrequencyExponentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPFrequencyExponent() {
        Float oldPFrequencyExponent = pFrequencyExponent;
        boolean oldPFrequencyExponentESet = pFrequencyExponentESet;
        pFrequencyExponent = PFREQUENCY_EXPONENT_EDEFAULT;
        pFrequencyExponentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT, oldPFrequencyExponent,
                PFREQUENCY_EXPONENT_EDEFAULT, oldPFrequencyExponentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPFrequencyExponent() {
        return pFrequencyExponentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPVoltageExponent() {
        return pVoltageExponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPVoltageExponent( Float newPVoltageExponent ) {
        Float oldPVoltageExponent = pVoltageExponent;
        pVoltageExponent = newPVoltageExponent;
        boolean oldPVoltageExponentESet = pVoltageExponentESet;
        pVoltageExponentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT, oldPVoltageExponent, pVoltageExponent,
                !oldPVoltageExponentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPVoltageExponent() {
        Float oldPVoltageExponent = pVoltageExponent;
        boolean oldPVoltageExponentESet = pVoltageExponentESet;
        pVoltageExponent = PVOLTAGE_EXPONENT_EDEFAULT;
        pVoltageExponentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT, oldPVoltageExponent,
                PVOLTAGE_EXPONENT_EDEFAULT, oldPVoltageExponentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPVoltageExponent() {
        return pVoltageExponentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQConstantCurrent() {
        return qConstantCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQConstantCurrent( Float newQConstantCurrent ) {
        Float oldQConstantCurrent = qConstantCurrent;
        qConstantCurrent = newQConstantCurrent;
        boolean oldQConstantCurrentESet = qConstantCurrentESet;
        qConstantCurrentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT, oldQConstantCurrent, qConstantCurrent,
                !oldQConstantCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQConstantCurrent() {
        Float oldQConstantCurrent = qConstantCurrent;
        boolean oldQConstantCurrentESet = qConstantCurrentESet;
        qConstantCurrent = QCONSTANT_CURRENT_EDEFAULT;
        qConstantCurrentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT, oldQConstantCurrent,
                QCONSTANT_CURRENT_EDEFAULT, oldQConstantCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQConstantCurrent() {
        return qConstantCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQConstantImpedance() {
        return qConstantImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQConstantImpedance( Float newQConstantImpedance ) {
        Float oldQConstantImpedance = qConstantImpedance;
        qConstantImpedance = newQConstantImpedance;
        boolean oldQConstantImpedanceESet = qConstantImpedanceESet;
        qConstantImpedanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE, oldQConstantImpedance, qConstantImpedance,
                !oldQConstantImpedanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQConstantImpedance() {
        Float oldQConstantImpedance = qConstantImpedance;
        boolean oldQConstantImpedanceESet = qConstantImpedanceESet;
        qConstantImpedance = QCONSTANT_IMPEDANCE_EDEFAULT;
        qConstantImpedanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE, oldQConstantImpedance,
                QCONSTANT_IMPEDANCE_EDEFAULT, oldQConstantImpedanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQConstantImpedance() {
        return qConstantImpedanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQConstantPower() {
        return qConstantPower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQConstantPower( Float newQConstantPower ) {
        Float oldQConstantPower = qConstantPower;
        qConstantPower = newQConstantPower;
        boolean oldQConstantPowerESet = qConstantPowerESet;
        qConstantPowerESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER,
                        oldQConstantPower, qConstantPower, !oldQConstantPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQConstantPower() {
        Float oldQConstantPower = qConstantPower;
        boolean oldQConstantPowerESet = qConstantPowerESet;
        qConstantPower = QCONSTANT_POWER_EDEFAULT;
        qConstantPowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER, oldQConstantPower, QCONSTANT_POWER_EDEFAULT,
                oldQConstantPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQConstantPower() {
        return qConstantPowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQFrequencyExponent() {
        return qFrequencyExponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQFrequencyExponent( Float newQFrequencyExponent ) {
        Float oldQFrequencyExponent = qFrequencyExponent;
        qFrequencyExponent = newQFrequencyExponent;
        boolean oldQFrequencyExponentESet = qFrequencyExponentESet;
        qFrequencyExponentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT, oldQFrequencyExponent, qFrequencyExponent,
                !oldQFrequencyExponentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQFrequencyExponent() {
        Float oldQFrequencyExponent = qFrequencyExponent;
        boolean oldQFrequencyExponentESet = qFrequencyExponentESet;
        qFrequencyExponent = QFREQUENCY_EXPONENT_EDEFAULT;
        qFrequencyExponentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT, oldQFrequencyExponent,
                QFREQUENCY_EXPONENT_EDEFAULT, oldQFrequencyExponentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQFrequencyExponent() {
        return qFrequencyExponentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQVoltageExponent() {
        return qVoltageExponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQVoltageExponent( Float newQVoltageExponent ) {
        Float oldQVoltageExponent = qVoltageExponent;
        qVoltageExponent = newQVoltageExponent;
        boolean oldQVoltageExponentESet = qVoltageExponentESet;
        qVoltageExponentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT, oldQVoltageExponent, qVoltageExponent,
                !oldQVoltageExponentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQVoltageExponent() {
        Float oldQVoltageExponent = qVoltageExponent;
        boolean oldQVoltageExponentESet = qVoltageExponentESet;
        qVoltageExponent = QVOLTAGE_EXPONENT_EDEFAULT;
        qVoltageExponentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT, oldQVoltageExponent,
                QVOLTAGE_EXPONENT_EDEFAULT, oldQVoltageExponentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQVoltageExponent() {
        return qVoltageExponentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EnergyConsumer > getEnergyConsumer() {
        if( energyConsumer == null ) {
            energyConsumer = new EObjectWithInverseResolvingEList.Unsettable< EnergyConsumer >( EnergyConsumer.class,
                    this, CimPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER,
                    CimPackage.ENERGY_CONSUMER__LOAD_RESPONSE );
        }
        return energyConsumer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyConsumer() {
        if( energyConsumer != null ) ( ( InternalEList.Unsettable< ? > ) energyConsumer ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyConsumer() {
        return energyConsumer != null && ( ( InternalEList.Unsettable< ? > ) energyConsumer ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEnergyConsumer() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
            return ( ( InternalEList< ? > ) getEnergyConsumer() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
            return getExponentModel();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
            return getPConstantCurrent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
            return getPConstantImpedance();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
            return getPConstantPower();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
            return getPFrequencyExponent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
            return getPVoltageExponent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
            return getQConstantCurrent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
            return getQConstantImpedance();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
            return getQConstantPower();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
            return getQFrequencyExponent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
            return getQVoltageExponent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
            return getEnergyConsumer();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
            setExponentModel( ( Boolean ) newValue );
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
            setPConstantCurrent( ( Float ) newValue );
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
            setPConstantImpedance( ( Float ) newValue );
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
            setPConstantPower( ( Float ) newValue );
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
            setPFrequencyExponent( ( Float ) newValue );
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
            setPVoltageExponent( ( Float ) newValue );
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
            setQConstantCurrent( ( Float ) newValue );
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
            setQConstantImpedance( ( Float ) newValue );
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
            setQConstantPower( ( Float ) newValue );
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
            setQFrequencyExponent( ( Float ) newValue );
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
            setQVoltageExponent( ( Float ) newValue );
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
            getEnergyConsumer().clear();
            getEnergyConsumer().addAll( ( Collection< ? extends EnergyConsumer > ) newValue );
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
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
            unsetExponentModel();
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
            unsetPConstantCurrent();
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
            unsetPConstantImpedance();
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
            unsetPConstantPower();
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
            unsetPFrequencyExponent();
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
            unsetPVoltageExponent();
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
            unsetQConstantCurrent();
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
            unsetQConstantImpedance();
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
            unsetQConstantPower();
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
            unsetQFrequencyExponent();
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
            unsetQVoltageExponent();
            return;
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
            unsetEnergyConsumer();
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
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
            return isSetExponentModel();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
            return isSetPConstantCurrent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
            return isSetPConstantImpedance();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
            return isSetPConstantPower();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
            return isSetPFrequencyExponent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
            return isSetPVoltageExponent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
            return isSetQConstantCurrent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
            return isSetQConstantImpedance();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
            return isSetQConstantPower();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
            return isSetQFrequencyExponent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
            return isSetQVoltageExponent();
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
            return isSetEnergyConsumer();
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
        result.append( " (exponentModel: " );
        if( exponentModelESet )
            result.append( exponentModel );
        else
            result.append( "<unset>" );
        result.append( ", pConstantCurrent: " );
        if( pConstantCurrentESet )
            result.append( pConstantCurrent );
        else
            result.append( "<unset>" );
        result.append( ", pConstantImpedance: " );
        if( pConstantImpedanceESet )
            result.append( pConstantImpedance );
        else
            result.append( "<unset>" );
        result.append( ", pConstantPower: " );
        if( pConstantPowerESet )
            result.append( pConstantPower );
        else
            result.append( "<unset>" );
        result.append( ", pFrequencyExponent: " );
        if( pFrequencyExponentESet )
            result.append( pFrequencyExponent );
        else
            result.append( "<unset>" );
        result.append( ", pVoltageExponent: " );
        if( pVoltageExponentESet )
            result.append( pVoltageExponent );
        else
            result.append( "<unset>" );
        result.append( ", qConstantCurrent: " );
        if( qConstantCurrentESet )
            result.append( qConstantCurrent );
        else
            result.append( "<unset>" );
        result.append( ", qConstantImpedance: " );
        if( qConstantImpedanceESet )
            result.append( qConstantImpedance );
        else
            result.append( "<unset>" );
        result.append( ", qConstantPower: " );
        if( qConstantPowerESet )
            result.append( qConstantPower );
        else
            result.append( "<unset>" );
        result.append( ", qFrequencyExponent: " );
        if( qFrequencyExponentESet )
            result.append( qFrequencyExponent );
        else
            result.append( "<unset>" );
        result.append( ", qVoltageExponent: " );
        if( qVoltageExponentESet )
            result.append( qVoltageExponent );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LoadResponseCharacteristicImpl
