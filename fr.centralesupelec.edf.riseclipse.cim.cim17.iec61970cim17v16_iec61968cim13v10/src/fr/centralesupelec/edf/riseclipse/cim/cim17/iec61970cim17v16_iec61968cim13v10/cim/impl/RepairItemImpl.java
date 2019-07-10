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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerRepairItemKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerRepairItemKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repair Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RepairItemImpl#getBreakerRepairItem <em>Breaker Repair Item</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RepairItemImpl#getTransformerRepairItem <em>Transformer Repair Item</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RepairItemImpl#getRepairWorkTask <em>Repair Work Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepairItemImpl extends CimObjectWithIDImpl implements RepairItem {
    /**
     * The default value of the '{@link #getBreakerRepairItem() <em>Breaker Repair Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerRepairItem()
     * @generated
     * @ordered
     */
    protected static final BreakerRepairItemKind BREAKER_REPAIR_ITEM_EDEFAULT = BreakerRepairItemKind.AIR_COMPRESSOR;

    /**
     * The cached value of the '{@link #getBreakerRepairItem() <em>Breaker Repair Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerRepairItem()
     * @generated
     * @ordered
     */
    protected BreakerRepairItemKind breakerRepairItem = BREAKER_REPAIR_ITEM_EDEFAULT;

    /**
     * This is true if the Breaker Repair Item attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean breakerRepairItemESet;

    /**
     * The default value of the '{@link #getTransformerRepairItem() <em>Transformer Repair Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerRepairItem()
     * @generated
     * @ordered
     */
    protected static final TransformerRepairItemKind TRANSFORMER_REPAIR_ITEM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTransformerRepairItem() <em>Transformer Repair Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerRepairItem()
     * @generated
     * @ordered
     */
    protected TransformerRepairItemKind transformerRepairItem = TRANSFORMER_REPAIR_ITEM_EDEFAULT;

    /**
     * This is true if the Transformer Repair Item attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transformerRepairItemESet;

    /**
     * The cached value of the '{@link #getRepairWorkTask() <em>Repair Work Task</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepairWorkTask()
     * @generated
     * @ordered
     */
    protected EList< RepairWorkTask > repairWorkTask;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RepairItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRepairItem();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BreakerRepairItemKind getBreakerRepairItem() {
        return breakerRepairItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBreakerRepairItem( BreakerRepairItemKind newBreakerRepairItem ) {
        BreakerRepairItemKind oldBreakerRepairItem = breakerRepairItem;
        breakerRepairItem = newBreakerRepairItem == null ? BREAKER_REPAIR_ITEM_EDEFAULT : newBreakerRepairItem;
        boolean oldBreakerRepairItemESet = breakerRepairItemESet;
        breakerRepairItemESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REPAIR_ITEM__BREAKER_REPAIR_ITEM,
                    oldBreakerRepairItem, breakerRepairItem, !oldBreakerRepairItemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBreakerRepairItem() {
        BreakerRepairItemKind oldBreakerRepairItem = breakerRepairItem;
        boolean oldBreakerRepairItemESet = breakerRepairItemESet;
        breakerRepairItem = BREAKER_REPAIR_ITEM_EDEFAULT;
        breakerRepairItemESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REPAIR_ITEM__BREAKER_REPAIR_ITEM,
                    oldBreakerRepairItem, BREAKER_REPAIR_ITEM_EDEFAULT, oldBreakerRepairItemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBreakerRepairItem() {
        return breakerRepairItemESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerRepairItemKind getTransformerRepairItem() {
        return transformerRepairItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransformerRepairItem( TransformerRepairItemKind newTransformerRepairItem ) {
        TransformerRepairItemKind oldTransformerRepairItem = transformerRepairItem;
        transformerRepairItem = newTransformerRepairItem == null ? TRANSFORMER_REPAIR_ITEM_EDEFAULT
                : newTransformerRepairItem;
        boolean oldTransformerRepairItemESet = transformerRepairItemESet;
        transformerRepairItemESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REPAIR_ITEM__TRANSFORMER_REPAIR_ITEM,
                    oldTransformerRepairItem, transformerRepairItem, !oldTransformerRepairItemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerRepairItem() {
        TransformerRepairItemKind oldTransformerRepairItem = transformerRepairItem;
        boolean oldTransformerRepairItemESet = transformerRepairItemESet;
        transformerRepairItem = TRANSFORMER_REPAIR_ITEM_EDEFAULT;
        transformerRepairItemESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REPAIR_ITEM__TRANSFORMER_REPAIR_ITEM,
                    oldTransformerRepairItem, TRANSFORMER_REPAIR_ITEM_EDEFAULT, oldTransformerRepairItemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerRepairItem() {
        return transformerRepairItemESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RepairWorkTask > getRepairWorkTask() {
        if( repairWorkTask == null ) {
            repairWorkTask = new EObjectWithInverseEList.Unsettable.ManyInverse< RepairWorkTask >( RepairWorkTask.class,
                    this, CimPackage.REPAIR_ITEM__REPAIR_WORK_TASK, CimPackage.REPAIR_WORK_TASK__BREAKER_REPAIR_ITEM );
        }
        return repairWorkTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRepairWorkTask() {
        if( repairWorkTask != null ) ( ( InternalEList.Unsettable< ? > ) repairWorkTask ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRepairWorkTask() {
        return repairWorkTask != null && ( ( InternalEList.Unsettable< ? > ) repairWorkTask ).isSet();
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
        case CimPackage.REPAIR_ITEM__REPAIR_WORK_TASK:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRepairWorkTask() )
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
        case CimPackage.REPAIR_ITEM__REPAIR_WORK_TASK:
            return ( ( InternalEList< ? > ) getRepairWorkTask() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.REPAIR_ITEM__BREAKER_REPAIR_ITEM:
            return getBreakerRepairItem();
        case CimPackage.REPAIR_ITEM__TRANSFORMER_REPAIR_ITEM:
            return getTransformerRepairItem();
        case CimPackage.REPAIR_ITEM__REPAIR_WORK_TASK:
            return getRepairWorkTask();
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
        case CimPackage.REPAIR_ITEM__BREAKER_REPAIR_ITEM:
            setBreakerRepairItem( ( BreakerRepairItemKind ) newValue );
            return;
        case CimPackage.REPAIR_ITEM__TRANSFORMER_REPAIR_ITEM:
            setTransformerRepairItem( ( TransformerRepairItemKind ) newValue );
            return;
        case CimPackage.REPAIR_ITEM__REPAIR_WORK_TASK:
            getRepairWorkTask().clear();
            getRepairWorkTask().addAll( ( Collection< ? extends RepairWorkTask > ) newValue );
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
        case CimPackage.REPAIR_ITEM__BREAKER_REPAIR_ITEM:
            unsetBreakerRepairItem();
            return;
        case CimPackage.REPAIR_ITEM__TRANSFORMER_REPAIR_ITEM:
            unsetTransformerRepairItem();
            return;
        case CimPackage.REPAIR_ITEM__REPAIR_WORK_TASK:
            unsetRepairWorkTask();
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
        case CimPackage.REPAIR_ITEM__BREAKER_REPAIR_ITEM:
            return isSetBreakerRepairItem();
        case CimPackage.REPAIR_ITEM__TRANSFORMER_REPAIR_ITEM:
            return isSetTransformerRepairItem();
        case CimPackage.REPAIR_ITEM__REPAIR_WORK_TASK:
            return isSetRepairWorkTask();
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
        result.append( " (breakerRepairItem: " );
        if( breakerRepairItemESet )
            result.append( breakerRepairItem );
        else
            result.append( "<unset>" );
        result.append( ", transformerRepairItem: " );
        if( transformerRepairItemESet )
            result.append( transformerRepairItem );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RepairItemImpl
