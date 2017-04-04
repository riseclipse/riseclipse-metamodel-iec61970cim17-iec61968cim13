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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequency Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FrequencyConverterImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FrequencyConverterImpl#getMaxP <em>Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FrequencyConverterImpl#getMaxU <em>Max U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FrequencyConverterImpl#getMinP <em>Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FrequencyConverterImpl#getMinU <em>Min U</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequencyConverterImpl extends RegulatingCondEqImpl implements FrequencyConverter {
    /**
     * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrequency()
     * @generated
     * @ordered
     */
    protected static final Float FREQUENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrequency()
     * @generated
     * @ordered
     */
    protected Float frequency = FREQUENCY_EDEFAULT;

    /**
     * This is true if the Frequency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean frequencyESet;

    /**
     * The default value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxP()
     * @generated
     * @ordered
     */
    protected static final Float MAX_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxP()
     * @generated
     * @ordered
     */
    protected Float maxP = MAX_P_EDEFAULT;

    /**
     * This is true if the Max P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxPESet;

    /**
     * The default value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxU()
     * @generated
     * @ordered
     */
    protected static final Float MAX_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxU()
     * @generated
     * @ordered
     */
    protected Float maxU = MAX_U_EDEFAULT;

    /**
     * This is true if the Max U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxUESet;

    /**
     * The default value of the '{@link #getMinP() <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinP()
     * @generated
     * @ordered
     */
    protected static final Float MIN_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinP() <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinP()
     * @generated
     * @ordered
     */
    protected Float minP = MIN_P_EDEFAULT;

    /**
     * This is true if the Min P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minPESet;

    /**
     * The default value of the '{@link #getMinU() <em>Min U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinU()
     * @generated
     * @ordered
     */
    protected static final Float MIN_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinU() <em>Min U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinU()
     * @generated
     * @ordered
     */
    protected Float minU = MIN_U_EDEFAULT;

    /**
     * This is true if the Min U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minUESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FrequencyConverterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getFrequencyConverter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFrequency() {
        return frequency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFrequency( Float newFrequency ) {
        Float oldFrequency = frequency;
        frequency = newFrequency;
        boolean oldFrequencyESet = frequencyESet;
        frequencyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FREQUENCY_CONVERTER__FREQUENCY, oldFrequency, frequency, !oldFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFrequency() {
        Float oldFrequency = frequency;
        boolean oldFrequencyESet = frequencyESet;
        frequency = FREQUENCY_EDEFAULT;
        frequencyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FREQUENCY_CONVERTER__FREQUENCY, oldFrequency, FREQUENCY_EDEFAULT, oldFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFrequency() {
        return frequencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxP() {
        return maxP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxP( Float newMaxP ) {
        Float oldMaxP = maxP;
        maxP = newMaxP;
        boolean oldMaxPESet = maxPESet;
        maxPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FREQUENCY_CONVERTER__MAX_P, oldMaxP, maxP, !oldMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxP() {
        Float oldMaxP = maxP;
        boolean oldMaxPESet = maxPESet;
        maxP = MAX_P_EDEFAULT;
        maxPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FREQUENCY_CONVERTER__MAX_P, oldMaxP, MAX_P_EDEFAULT, oldMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxP() {
        return maxPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxU() {
        return maxU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxU( Float newMaxU ) {
        Float oldMaxU = maxU;
        maxU = newMaxU;
        boolean oldMaxUESet = maxUESet;
        maxUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FREQUENCY_CONVERTER__MAX_U, oldMaxU, maxU, !oldMaxUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxU() {
        Float oldMaxU = maxU;
        boolean oldMaxUESet = maxUESet;
        maxU = MAX_U_EDEFAULT;
        maxUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FREQUENCY_CONVERTER__MAX_U, oldMaxU, MAX_U_EDEFAULT, oldMaxUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxU() {
        return maxUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinP() {
        return minP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinP( Float newMinP ) {
        Float oldMinP = minP;
        minP = newMinP;
        boolean oldMinPESet = minPESet;
        minPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FREQUENCY_CONVERTER__MIN_P, oldMinP, minP, !oldMinPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinP() {
        Float oldMinP = minP;
        boolean oldMinPESet = minPESet;
        minP = MIN_P_EDEFAULT;
        minPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FREQUENCY_CONVERTER__MIN_P, oldMinP, MIN_P_EDEFAULT, oldMinPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinP() {
        return minPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinU() {
        return minU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinU( Float newMinU ) {
        Float oldMinU = minU;
        minU = newMinU;
        boolean oldMinUESet = minUESet;
        minUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FREQUENCY_CONVERTER__MIN_U, oldMinU, minU, !oldMinUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinU() {
        Float oldMinU = minU;
        boolean oldMinUESet = minUESet;
        minU = MIN_U_EDEFAULT;
        minUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FREQUENCY_CONVERTER__MIN_U, oldMinU, MIN_U_EDEFAULT, oldMinUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinU() {
        return minUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.FREQUENCY_CONVERTER__FREQUENCY:
            return getFrequency();
        case CimPackage.FREQUENCY_CONVERTER__MAX_P:
            return getMaxP();
        case CimPackage.FREQUENCY_CONVERTER__MAX_U:
            return getMaxU();
        case CimPackage.FREQUENCY_CONVERTER__MIN_P:
            return getMinP();
        case CimPackage.FREQUENCY_CONVERTER__MIN_U:
            return getMinU();
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
        case CimPackage.FREQUENCY_CONVERTER__FREQUENCY:
            setFrequency( ( Float ) newValue );
            return;
        case CimPackage.FREQUENCY_CONVERTER__MAX_P:
            setMaxP( ( Float ) newValue );
            return;
        case CimPackage.FREQUENCY_CONVERTER__MAX_U:
            setMaxU( ( Float ) newValue );
            return;
        case CimPackage.FREQUENCY_CONVERTER__MIN_P:
            setMinP( ( Float ) newValue );
            return;
        case CimPackage.FREQUENCY_CONVERTER__MIN_U:
            setMinU( ( Float ) newValue );
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
        case CimPackage.FREQUENCY_CONVERTER__FREQUENCY:
            unsetFrequency();
            return;
        case CimPackage.FREQUENCY_CONVERTER__MAX_P:
            unsetMaxP();
            return;
        case CimPackage.FREQUENCY_CONVERTER__MAX_U:
            unsetMaxU();
            return;
        case CimPackage.FREQUENCY_CONVERTER__MIN_P:
            unsetMinP();
            return;
        case CimPackage.FREQUENCY_CONVERTER__MIN_U:
            unsetMinU();
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
        case CimPackage.FREQUENCY_CONVERTER__FREQUENCY:
            return isSetFrequency();
        case CimPackage.FREQUENCY_CONVERTER__MAX_P:
            return isSetMaxP();
        case CimPackage.FREQUENCY_CONVERTER__MAX_U:
            return isSetMaxU();
        case CimPackage.FREQUENCY_CONVERTER__MIN_P:
            return isSetMinP();
        case CimPackage.FREQUENCY_CONVERTER__MIN_U:
            return isSetMinU();
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
        result.append( " (frequency: " );
        if( frequencyESet )
            result.append( frequency );
        else
            result.append( "<unset>" );
        result.append( ", maxP: " );
        if( maxPESet )
            result.append( maxP );
        else
            result.append( "<unset>" );
        result.append( ", maxU: " );
        if( maxUESet )
            result.append( maxU );
        else
            result.append( "<unset>" );
        result.append( ", minP: " );
        if( minPESet )
            result.append( minP );
        else
            result.append( "<unset>" );
        result.append( ", minU: " );
        if( minUESet )
            result.append( minU );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //FrequencyConverterImpl
