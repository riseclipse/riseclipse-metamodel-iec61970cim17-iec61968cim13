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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StringMeasurement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StringMeasurementValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StringMeasurementImpl#getStringMeasurementValues <em>String Measurement Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringMeasurementImpl extends MeasurementImpl implements StringMeasurement {
    /**
     * The cached value of the '{@link #getStringMeasurementValues() <em>String Measurement Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStringMeasurementValues()
     * @generated
     * @ordered
     */
    protected EList< StringMeasurementValue > stringMeasurementValues;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringMeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStringMeasurement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< StringMeasurementValue > getStringMeasurementValues() {
        if( stringMeasurementValues == null ) {
            stringMeasurementValues = new EObjectWithInverseResolvingEList.Unsettable< StringMeasurementValue >(
                    StringMeasurementValue.class, this, CimPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES,
                    CimPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT );
        }
        return stringMeasurementValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStringMeasurementValues() {
        if( stringMeasurementValues != null ) ( ( InternalEList.Unsettable< ? > ) stringMeasurementValues ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStringMeasurementValues() {
        return stringMeasurementValues != null && ( ( InternalEList.Unsettable< ? > ) stringMeasurementValues ).isSet();
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
        case CimPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getStringMeasurementValues() )
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
        case CimPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
            return ( ( InternalEList< ? > ) getStringMeasurementValues() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
            return getStringMeasurementValues();
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
        case CimPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
            getStringMeasurementValues().clear();
            getStringMeasurementValues().addAll( ( Collection< ? extends StringMeasurementValue > ) newValue );
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
        case CimPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
            unsetStringMeasurementValues();
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
        case CimPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
            return isSetStringMeasurementValues();
        }
        return super.eIsSet( featureID );
    }

} //StringMeasurementImpl
