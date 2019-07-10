/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTest;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerTestImpl#getBasePower <em>Base Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerTestImpl#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerTestImpl extends IdentifiedObjectImpl implements TransformerTest {
    /**
     * The default value of the '{@link #getBasePower() <em>Base Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBasePower()
     * @generated
     * @ordered
     */
    protected static final Float BASE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBasePower() <em>Base Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBasePower()
     * @generated
     * @ordered
     */
    protected Float basePower = BASE_POWER_EDEFAULT;

    /**
     * This is true if the Base Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean basePowerESet;

    /**
     * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemperature()
     * @generated
     * @ordered
     */
    protected static final Float TEMPERATURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemperature()
     * @generated
     * @ordered
     */
    protected Float temperature = TEMPERATURE_EDEFAULT;

    /**
     * This is true if the Temperature attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean temperatureESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformerTestImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTransformerTest();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBasePower() {
        return basePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBasePower( Float newBasePower ) {
        Float oldBasePower = basePower;
        basePower = newBasePower;
        boolean oldBasePowerESet = basePowerESet;
        basePowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_TEST__BASE_POWER, oldBasePower, basePower, !oldBasePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBasePower() {
        Float oldBasePower = basePower;
        boolean oldBasePowerESet = basePowerESet;
        basePower = BASE_POWER_EDEFAULT;
        basePowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_TEST__BASE_POWER, oldBasePower, BASE_POWER_EDEFAULT, oldBasePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBasePower() {
        return basePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTemperature() {
        return temperature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTemperature( Float newTemperature ) {
        Float oldTemperature = temperature;
        temperature = newTemperature;
        boolean oldTemperatureESet = temperatureESet;
        temperatureESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_TEST__TEMPERATURE, oldTemperature, temperature, !oldTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTemperature() {
        Float oldTemperature = temperature;
        boolean oldTemperatureESet = temperatureESet;
        temperature = TEMPERATURE_EDEFAULT;
        temperatureESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_TEST__TEMPERATURE, oldTemperature, TEMPERATURE_EDEFAULT, oldTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTemperature() {
        return temperatureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TRANSFORMER_TEST__BASE_POWER:
            return getBasePower();
        case CimPackage.TRANSFORMER_TEST__TEMPERATURE:
            return getTemperature();
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
        case CimPackage.TRANSFORMER_TEST__BASE_POWER:
            setBasePower( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_TEST__TEMPERATURE:
            setTemperature( ( Float ) newValue );
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
        case CimPackage.TRANSFORMER_TEST__BASE_POWER:
            unsetBasePower();
            return;
        case CimPackage.TRANSFORMER_TEST__TEMPERATURE:
            unsetTemperature();
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
        case CimPackage.TRANSFORMER_TEST__BASE_POWER:
            return isSetBasePower();
        case CimPackage.TRANSFORMER_TEST__TEMPERATURE:
            return isSetTemperature();
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
        result.append( " (basePower: " );
        if( basePowerESet )
            result.append( basePower );
        else
            result.append( "<unset>" );
        result.append( ", temperature: " );
        if( temperatureESet )
            result.append( temperature );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TransformerTestImpl
