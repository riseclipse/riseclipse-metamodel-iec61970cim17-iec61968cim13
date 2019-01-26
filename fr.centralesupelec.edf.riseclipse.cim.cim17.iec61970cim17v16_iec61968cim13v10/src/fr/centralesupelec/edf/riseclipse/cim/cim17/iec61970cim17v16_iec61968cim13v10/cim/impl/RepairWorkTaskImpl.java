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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask;

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
 * An implementation of the model object '<em><b>Repair Work Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RepairWorkTaskImpl#getEmergency <em>Emergency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RepairWorkTaskImpl#getBreakerRepairItem <em>Breaker Repair Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepairWorkTaskImpl extends WorkTaskImpl implements RepairWorkTask {
    /**
     * The default value of the '{@link #getEmergency() <em>Emergency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmergency()
     * @generated
     * @ordered
     */
    protected static final Boolean EMERGENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmergency() <em>Emergency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmergency()
     * @generated
     * @ordered
     */
    protected Boolean emergency = EMERGENCY_EDEFAULT;

    /**
     * This is true if the Emergency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean emergencyESet;

    /**
     * The cached value of the '{@link #getBreakerRepairItem() <em>Breaker Repair Item</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerRepairItem()
     * @generated
     * @ordered
     */
    protected EList< RepairItem > breakerRepairItem;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RepairWorkTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRepairWorkTask();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getEmergency() {
        return emergency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEmergency( Boolean newEmergency ) {
        Boolean oldEmergency = emergency;
        emergency = newEmergency;
        boolean oldEmergencyESet = emergencyESet;
        emergencyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REPAIR_WORK_TASK__EMERGENCY, oldEmergency, emergency, !oldEmergencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmergency() {
        Boolean oldEmergency = emergency;
        boolean oldEmergencyESet = emergencyESet;
        emergency = EMERGENCY_EDEFAULT;
        emergencyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REPAIR_WORK_TASK__EMERGENCY, oldEmergency, EMERGENCY_EDEFAULT, oldEmergencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmergency() {
        return emergencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RepairItem > getBreakerRepairItem() {
        if( breakerRepairItem == null ) {
            breakerRepairItem = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< RepairItem >(
                    RepairItem.class, this, CimPackage.REPAIR_WORK_TASK__BREAKER_REPAIR_ITEM,
                    CimPackage.REPAIR_ITEM__REPAIR_WORK_TASK );
        }
        return breakerRepairItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBreakerRepairItem() {
        if( breakerRepairItem != null ) ( ( InternalEList.Unsettable< ? > ) breakerRepairItem ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBreakerRepairItem() {
        return breakerRepairItem != null && ( ( InternalEList.Unsettable< ? > ) breakerRepairItem ).isSet();
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
        case CimPackage.REPAIR_WORK_TASK__BREAKER_REPAIR_ITEM:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBreakerRepairItem() )
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
        case CimPackage.REPAIR_WORK_TASK__BREAKER_REPAIR_ITEM:
            return ( ( InternalEList< ? > ) getBreakerRepairItem() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.REPAIR_WORK_TASK__EMERGENCY:
            return getEmergency();
        case CimPackage.REPAIR_WORK_TASK__BREAKER_REPAIR_ITEM:
            return getBreakerRepairItem();
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
        case CimPackage.REPAIR_WORK_TASK__EMERGENCY:
            setEmergency( ( Boolean ) newValue );
            return;
        case CimPackage.REPAIR_WORK_TASK__BREAKER_REPAIR_ITEM:
            getBreakerRepairItem().clear();
            getBreakerRepairItem().addAll( ( Collection< ? extends RepairItem > ) newValue );
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
        case CimPackage.REPAIR_WORK_TASK__EMERGENCY:
            unsetEmergency();
            return;
        case CimPackage.REPAIR_WORK_TASK__BREAKER_REPAIR_ITEM:
            unsetBreakerRepairItem();
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
        case CimPackage.REPAIR_WORK_TASK__EMERGENCY:
            return isSetEmergency();
        case CimPackage.REPAIR_WORK_TASK__BREAKER_REPAIR_ITEM:
            return isSetBreakerRepairItem();
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
        result.append( " (emergency: " );
        if( emergencyESet )
            result.append( emergency );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RepairWorkTaskImpl
