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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsCapabilityCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vs Capability Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VsCapabilityCurveImpl#getVsConverterDCSides <em>Vs Converter DC Sides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VsCapabilityCurveImpl extends CurveImpl implements VsCapabilityCurve {
    /**
     * The cached value of the '{@link #getVsConverterDCSides() <em>Vs Converter DC Sides</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsConverterDCSides()
     * @generated
     * @ordered
     */
    protected EList< VsConverter > vsConverterDCSides;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VsCapabilityCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVsCapabilityCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< VsConverter > getVsConverterDCSides() {
        if( vsConverterDCSides == null ) {
            vsConverterDCSides = new EObjectWithInverseResolvingEList.Unsettable< VsConverter >( VsConverter.class,
                    this, CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES,
                    CimPackage.VS_CONVERTER__CAPABILITY_CURVE );
        }
        return vsConverterDCSides;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsConverterDCSides() {
        if( vsConverterDCSides != null ) ( ( InternalEList.Unsettable< ? > ) vsConverterDCSides ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsConverterDCSides() {
        return vsConverterDCSides != null && ( ( InternalEList.Unsettable< ? > ) vsConverterDCSides ).isSet();
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
        case CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVsConverterDCSides() )
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
        case CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES:
            return ( ( InternalEList< ? > ) getVsConverterDCSides() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES:
            return getVsConverterDCSides();
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
        case CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES:
            getVsConverterDCSides().clear();
            getVsConverterDCSides().addAll( ( Collection< ? extends VsConverter > ) newValue );
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
        case CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES:
            unsetVsConverterDCSides();
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
        case CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES:
            return isSetVsConverterDCSides();
        }
        return super.eIsSet( featureID );
    }

} //VsCapabilityCurveImpl
