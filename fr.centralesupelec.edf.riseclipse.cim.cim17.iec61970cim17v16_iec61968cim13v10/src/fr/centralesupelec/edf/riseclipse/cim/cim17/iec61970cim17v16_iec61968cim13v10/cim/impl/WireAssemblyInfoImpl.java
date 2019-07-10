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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthLineParameter;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireAssemblyInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire Assembly Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireAssemblyInfoImpl#getWirePhaseInfo <em>Wire Phase Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireAssemblyInfoImpl#getPerLengthLineParameter <em>Per Length Line Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WireAssemblyInfoImpl extends AssetInfoImpl implements WireAssemblyInfo {
    /**
     * The cached value of the '{@link #getWirePhaseInfo() <em>Wire Phase Info</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWirePhaseInfo()
     * @generated
     * @ordered
     */
    protected EList< WirePhaseInfo > wirePhaseInfo;

    /**
     * The cached value of the '{@link #getPerLengthLineParameter() <em>Per Length Line Parameter</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPerLengthLineParameter()
     * @generated
     * @ordered
     */
    protected EList< PerLengthLineParameter > perLengthLineParameter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WireAssemblyInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWireAssemblyInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WirePhaseInfo > getWirePhaseInfo() {
        if( wirePhaseInfo == null ) {
            wirePhaseInfo = new EObjectWithInverseResolvingEList.Unsettable< WirePhaseInfo >( WirePhaseInfo.class, this,
                    CimPackage.WIRE_ASSEMBLY_INFO__WIRE_PHASE_INFO, CimPackage.WIRE_PHASE_INFO__WIRE_ASSEMBLY_INFO );
        }
        return wirePhaseInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWirePhaseInfo() {
        if( wirePhaseInfo != null ) ( ( InternalEList.Unsettable< ? > ) wirePhaseInfo ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWirePhaseInfo() {
        return wirePhaseInfo != null && ( ( InternalEList.Unsettable< ? > ) wirePhaseInfo ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PerLengthLineParameter > getPerLengthLineParameter() {
        if( perLengthLineParameter == null ) {
            perLengthLineParameter = new EObjectWithInverseResolvingEList.Unsettable< PerLengthLineParameter >(
                    PerLengthLineParameter.class, this, CimPackage.WIRE_ASSEMBLY_INFO__PER_LENGTH_LINE_PARAMETER,
                    CimPackage.PER_LENGTH_LINE_PARAMETER__WIRE_ASSEMBLY_INFO );
        }
        return perLengthLineParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPerLengthLineParameter() {
        if( perLengthLineParameter != null ) ( ( InternalEList.Unsettable< ? > ) perLengthLineParameter ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPerLengthLineParameter() {
        return perLengthLineParameter != null && ( ( InternalEList.Unsettable< ? > ) perLengthLineParameter ).isSet();
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
        case CimPackage.WIRE_ASSEMBLY_INFO__WIRE_PHASE_INFO:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWirePhaseInfo() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.WIRE_ASSEMBLY_INFO__PER_LENGTH_LINE_PARAMETER:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPerLengthLineParameter() )
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
        case CimPackage.WIRE_ASSEMBLY_INFO__WIRE_PHASE_INFO:
            return ( ( InternalEList< ? > ) getWirePhaseInfo() ).basicRemove( otherEnd, msgs );
        case CimPackage.WIRE_ASSEMBLY_INFO__PER_LENGTH_LINE_PARAMETER:
            return ( ( InternalEList< ? > ) getPerLengthLineParameter() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.WIRE_ASSEMBLY_INFO__WIRE_PHASE_INFO:
            return getWirePhaseInfo();
        case CimPackage.WIRE_ASSEMBLY_INFO__PER_LENGTH_LINE_PARAMETER:
            return getPerLengthLineParameter();
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
        case CimPackage.WIRE_ASSEMBLY_INFO__WIRE_PHASE_INFO:
            getWirePhaseInfo().clear();
            getWirePhaseInfo().addAll( ( Collection< ? extends WirePhaseInfo > ) newValue );
            return;
        case CimPackage.WIRE_ASSEMBLY_INFO__PER_LENGTH_LINE_PARAMETER:
            getPerLengthLineParameter().clear();
            getPerLengthLineParameter().addAll( ( Collection< ? extends PerLengthLineParameter > ) newValue );
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
        case CimPackage.WIRE_ASSEMBLY_INFO__WIRE_PHASE_INFO:
            unsetWirePhaseInfo();
            return;
        case CimPackage.WIRE_ASSEMBLY_INFO__PER_LENGTH_LINE_PARAMETER:
            unsetPerLengthLineParameter();
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
        case CimPackage.WIRE_ASSEMBLY_INFO__WIRE_PHASE_INFO:
            return isSetWirePhaseInfo();
        case CimPackage.WIRE_ASSEMBLY_INFO__PER_LENGTH_LINE_PARAMETER:
            return isSetPerLengthLineParameter();
        }
        return super.eIsSet( featureID );
    }

} //WireAssemblyInfoImpl
