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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentNetwork;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquivalentNetworkImpl#getEquivalentEquipments <em>Equivalent Equipments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquivalentNetworkImpl extends ConnectivityNodeContainerImpl implements EquivalentNetwork {
    /**
     * The cached value of the '{@link #getEquivalentEquipments() <em>Equivalent Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquivalentEquipments()
     * @generated
     * @ordered
     */
    protected EList< EquivalentEquipment > equivalentEquipments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EquivalentNetworkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEquivalentNetwork();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EquivalentEquipment > getEquivalentEquipments() {
        if( equivalentEquipments == null ) {
            equivalentEquipments = new EObjectWithInverseResolvingEList.Unsettable< EquivalentEquipment >(
                    EquivalentEquipment.class, this, CimPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS,
                    CimPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK );
        }
        return equivalentEquipments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEquivalentEquipments() {
        if( equivalentEquipments != null ) ( ( InternalEList.Unsettable< ? > ) equivalentEquipments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquivalentEquipments() {
        return equivalentEquipments != null && ( ( InternalEList.Unsettable< ? > ) equivalentEquipments ).isSet();
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
        case CimPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEquivalentEquipments() )
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
        case CimPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
            return ( ( InternalEList< ? > ) getEquivalentEquipments() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
            return getEquivalentEquipments();
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
        case CimPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
            getEquivalentEquipments().clear();
            getEquivalentEquipments().addAll( ( Collection< ? extends EquivalentEquipment > ) newValue );
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
        case CimPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
            unsetEquivalentEquipments();
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
        case CimPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
            return isSetEquivalentEquipments();
        }
        return super.eIsSet( featureID );
    }

} //EquivalentNetworkImpl
