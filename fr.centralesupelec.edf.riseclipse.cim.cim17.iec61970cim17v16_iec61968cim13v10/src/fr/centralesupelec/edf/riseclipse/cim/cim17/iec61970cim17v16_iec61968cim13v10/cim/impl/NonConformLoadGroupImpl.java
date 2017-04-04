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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonConformLoad;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonConformLoadGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonConformLoadSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NonConformLoadGroupImpl#getEnergyConsumers <em>Energy Consumers</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NonConformLoadGroupImpl#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonConformLoadGroupImpl extends LoadGroupImpl implements NonConformLoadGroup {
    /**
     * The cached value of the '{@link #getEnergyConsumers() <em>Energy Consumers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyConsumers()
     * @generated
     * @ordered
     */
    protected EList< NonConformLoad > energyConsumers;

    /**
     * The cached value of the '{@link #getNonConformLoadSchedules() <em>Non Conform Load Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNonConformLoadSchedules()
     * @generated
     * @ordered
     */
    protected EList< NonConformLoadSchedule > nonConformLoadSchedules;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NonConformLoadGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getNonConformLoadGroup();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< NonConformLoad > getEnergyConsumers() {
        if( energyConsumers == null ) {
            energyConsumers = new EObjectWithInverseResolvingEList.Unsettable< NonConformLoad >( NonConformLoad.class,
                    this, CimPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS,
                    CimPackage.NON_CONFORM_LOAD__LOAD_GROUP );
        }
        return energyConsumers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyConsumers() {
        if( energyConsumers != null ) ( ( InternalEList.Unsettable< ? > ) energyConsumers ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyConsumers() {
        return energyConsumers != null && ( ( InternalEList.Unsettable< ? > ) energyConsumers ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< NonConformLoadSchedule > getNonConformLoadSchedules() {
        if( nonConformLoadSchedules == null ) {
            nonConformLoadSchedules = new EObjectWithInverseResolvingEList.Unsettable< NonConformLoadSchedule >(
                    NonConformLoadSchedule.class, this, CimPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES,
                    CimPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP );
        }
        return nonConformLoadSchedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNonConformLoadSchedules() {
        if( nonConformLoadSchedules != null ) ( ( InternalEList.Unsettable< ? > ) nonConformLoadSchedules ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNonConformLoadSchedules() {
        return nonConformLoadSchedules != null && ( ( InternalEList.Unsettable< ? > ) nonConformLoadSchedules ).isSet();
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
        case CimPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEnergyConsumers() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getNonConformLoadSchedules() )
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
        case CimPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            return ( ( InternalEList< ? > ) getEnergyConsumers() ).basicRemove( otherEnd, msgs );
        case CimPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
            return ( ( InternalEList< ? > ) getNonConformLoadSchedules() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            return getEnergyConsumers();
        case CimPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
            return getNonConformLoadSchedules();
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
        case CimPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            getEnergyConsumers().clear();
            getEnergyConsumers().addAll( ( Collection< ? extends NonConformLoad > ) newValue );
            return;
        case CimPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
            getNonConformLoadSchedules().clear();
            getNonConformLoadSchedules().addAll( ( Collection< ? extends NonConformLoadSchedule > ) newValue );
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
        case CimPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            unsetEnergyConsumers();
            return;
        case CimPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
            unsetNonConformLoadSchedules();
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
        case CimPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            return isSetEnergyConsumers();
        case CimPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
            return isSetNonConformLoadSchedules();
        }
        return super.eIsSet( featureID );
    }

} //NonConformLoadGroupImpl
