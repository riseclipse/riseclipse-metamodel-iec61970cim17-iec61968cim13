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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConformLoad;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConformLoadGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConformLoadSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConformLoadGroupImpl#getConformLoadSchedules <em>Conform Load Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConformLoadGroupImpl#getEnergyConsumers <em>Energy Consumers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformLoadGroupImpl extends LoadGroupImpl implements ConformLoadGroup {
    /**
     * The cached value of the '{@link #getConformLoadSchedules() <em>Conform Load Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConformLoadSchedules()
     * @generated
     * @ordered
     */
    protected EList< ConformLoadSchedule > conformLoadSchedules;

    /**
     * The cached value of the '{@link #getEnergyConsumers() <em>Energy Consumers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyConsumers()
     * @generated
     * @ordered
     */
    protected EList< ConformLoad > energyConsumers;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConformLoadGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConformLoadGroup();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConformLoadSchedule > getConformLoadSchedules() {
        if( conformLoadSchedules == null ) {
            conformLoadSchedules = new EObjectWithInverseResolvingEList.Unsettable< ConformLoadSchedule >(
                    ConformLoadSchedule.class, this, CimPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES,
                    CimPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP );
        }
        return conformLoadSchedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConformLoadSchedules() {
        if( conformLoadSchedules != null ) ( ( InternalEList.Unsettable< ? > ) conformLoadSchedules ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConformLoadSchedules() {
        return conformLoadSchedules != null && ( ( InternalEList.Unsettable< ? > ) conformLoadSchedules ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConformLoad > getEnergyConsumers() {
        if( energyConsumers == null ) {
            energyConsumers = new EObjectWithInverseResolvingEList.Unsettable< ConformLoad >( ConformLoad.class, this,
                    CimPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, CimPackage.CONFORM_LOAD__LOAD_GROUP );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConformLoadSchedules() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEnergyConsumers() )
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
        case CimPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
            return ( ( InternalEList< ? > ) getConformLoadSchedules() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            return ( ( InternalEList< ? > ) getEnergyConsumers() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
            return getConformLoadSchedules();
        case CimPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            return getEnergyConsumers();
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
        case CimPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
            getConformLoadSchedules().clear();
            getConformLoadSchedules().addAll( ( Collection< ? extends ConformLoadSchedule > ) newValue );
            return;
        case CimPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            getEnergyConsumers().clear();
            getEnergyConsumers().addAll( ( Collection< ? extends ConformLoad > ) newValue );
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
        case CimPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
            unsetConformLoadSchedules();
            return;
        case CimPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            unsetEnergyConsumers();
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
        case CimPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
            return isSetConformLoadSchedules();
        case CimPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
            return isSetEnergyConsumers();
        }
        return super.eIsSet( featureID );
    }

} //ConformLoadGroupImpl
