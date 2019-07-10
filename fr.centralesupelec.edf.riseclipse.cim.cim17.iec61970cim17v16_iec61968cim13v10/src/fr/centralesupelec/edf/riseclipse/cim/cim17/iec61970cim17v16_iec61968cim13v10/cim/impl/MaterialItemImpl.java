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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntegerQuantity;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaterialItem;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MaterialItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MaterialItemImpl#getWorkTask <em>Work Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialItemImpl extends IdentifiedObjectImpl implements MaterialItem {
    /**
     * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuantity()
     * @generated
     * @ordered
     */
    protected IntegerQuantity quantity;

    /**
     * This is true if the Quantity containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean quantityESet;

    /**
     * The cached value of the '{@link #getWorkTask() <em>Work Task</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkTask()
     * @generated
     * @ordered
     */
    protected WorkTask workTask;

    /**
     * This is true if the Work Task reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean workTaskESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MaterialItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMaterialItem();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IntegerQuantity getQuantity() {
        return quantity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetQuantity( IntegerQuantity newQuantity, NotificationChain msgs ) {
        IntegerQuantity oldQuantity = quantity;
        quantity = newQuantity;
        boolean oldQuantityESet = quantityESet;
        quantityESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MATERIAL_ITEM__QUANTITY, oldQuantity, newQuantity, !oldQuantityESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQuantity( IntegerQuantity newQuantity ) {
        if( newQuantity != quantity ) {
            NotificationChain msgs = null;
            if( quantity != null ) msgs = ( ( InternalEObject ) quantity ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.MATERIAL_ITEM__QUANTITY, null, msgs );
            if( newQuantity != null ) msgs = ( ( InternalEObject ) newQuantity ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.MATERIAL_ITEM__QUANTITY, null, msgs );
            msgs = basicSetQuantity( newQuantity, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldQuantityESet = quantityESet;
            quantityESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.MATERIAL_ITEM__QUANTITY, newQuantity, newQuantity, !oldQuantityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetQuantity( NotificationChain msgs ) {
        IntegerQuantity oldQuantity = quantity;
        quantity = null;
        boolean oldQuantityESet = quantityESet;
        quantityESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MATERIAL_ITEM__QUANTITY, oldQuantity, null, oldQuantityESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQuantity() {
        if( quantity != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) quantity ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.MATERIAL_ITEM__QUANTITY, null, msgs );
            msgs = basicUnsetQuantity( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldQuantityESet = quantityESet;
            quantityESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MATERIAL_ITEM__QUANTITY, null, null, oldQuantityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQuantity() {
        return quantityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WorkTask getWorkTask() {
        return workTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWorkTask( WorkTask newWorkTask, NotificationChain msgs ) {
        WorkTask oldWorkTask = workTask;
        workTask = newWorkTask;
        boolean oldWorkTaskESet = workTaskESet;
        workTaskESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MATERIAL_ITEM__WORK_TASK, oldWorkTask, newWorkTask, !oldWorkTaskESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWorkTask( WorkTask newWorkTask ) {
        if( newWorkTask != workTask ) {
            NotificationChain msgs = null;
            if( workTask != null ) msgs = ( ( InternalEObject ) workTask ).eInverseRemove( this,
                    CimPackage.WORK_TASK__MATERIAL_ITEMS, WorkTask.class, msgs );
            if( newWorkTask != null ) msgs = ( ( InternalEObject ) newWorkTask ).eInverseAdd( this,
                    CimPackage.WORK_TASK__MATERIAL_ITEMS, WorkTask.class, msgs );
            msgs = basicSetWorkTask( newWorkTask, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWorkTaskESet = workTaskESet;
            workTaskESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.MATERIAL_ITEM__WORK_TASK, newWorkTask, newWorkTask, !oldWorkTaskESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWorkTask( NotificationChain msgs ) {
        WorkTask oldWorkTask = workTask;
        workTask = null;
        boolean oldWorkTaskESet = workTaskESet;
        workTaskESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MATERIAL_ITEM__WORK_TASK, oldWorkTask, null, oldWorkTaskESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorkTask() {
        if( workTask != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) workTask ).eInverseRemove( this, CimPackage.WORK_TASK__MATERIAL_ITEMS,
                    WorkTask.class, msgs );
            msgs = basicUnsetWorkTask( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWorkTaskESet = workTaskESet;
            workTaskESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MATERIAL_ITEM__WORK_TASK, null, null, oldWorkTaskESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkTask() {
        return workTaskESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.MATERIAL_ITEM__WORK_TASK:
            if( workTask != null ) msgs = ( ( InternalEObject ) workTask ).eInverseRemove( this,
                    CimPackage.WORK_TASK__MATERIAL_ITEMS, WorkTask.class, msgs );
            return basicSetWorkTask( ( WorkTask ) otherEnd, msgs );
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
        case CimPackage.MATERIAL_ITEM__QUANTITY:
            return basicUnsetQuantity( msgs );
        case CimPackage.MATERIAL_ITEM__WORK_TASK:
            return basicUnsetWorkTask( msgs );
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
        case CimPackage.MATERIAL_ITEM__QUANTITY:
            return getQuantity();
        case CimPackage.MATERIAL_ITEM__WORK_TASK:
            return getWorkTask();
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
        case CimPackage.MATERIAL_ITEM__QUANTITY:
            setQuantity( ( IntegerQuantity ) newValue );
            return;
        case CimPackage.MATERIAL_ITEM__WORK_TASK:
            setWorkTask( ( WorkTask ) newValue );
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
        case CimPackage.MATERIAL_ITEM__QUANTITY:
            unsetQuantity();
            return;
        case CimPackage.MATERIAL_ITEM__WORK_TASK:
            unsetWorkTask();
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
        case CimPackage.MATERIAL_ITEM__QUANTITY:
            return isSetQuantity();
        case CimPackage.MATERIAL_ITEM__WORK_TASK:
            return isSetWorkTask();
        }
        return super.eIsSet( featureID );
    }

} //MaterialItemImpl
