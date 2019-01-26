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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerMaintenanceKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceWorkTask;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMaintenanceKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintenance Work Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MaintenanceWorkTaskImpl#getBreakerMaintenanceKind <em>Breaker Maintenance Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MaintenanceWorkTaskImpl#getTransformerMaintenanceKind <em>Transformer Maintenance Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaintenanceWorkTaskImpl extends WorkTaskImpl implements MaintenanceWorkTask {
    /**
     * The default value of the '{@link #getBreakerMaintenanceKind() <em>Breaker Maintenance Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerMaintenanceKind()
     * @generated
     * @ordered
     */
    protected static final BreakerMaintenanceKind BREAKER_MAINTENANCE_KIND_EDEFAULT = BreakerMaintenanceKind.EXTERNAL_OUT_OF_SERVICE;

    /**
     * The cached value of the '{@link #getBreakerMaintenanceKind() <em>Breaker Maintenance Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreakerMaintenanceKind()
     * @generated
     * @ordered
     */
    protected BreakerMaintenanceKind breakerMaintenanceKind = BREAKER_MAINTENANCE_KIND_EDEFAULT;

    /**
     * This is true if the Breaker Maintenance Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean breakerMaintenanceKindESet;

    /**
     * The default value of the '{@link #getTransformerMaintenanceKind() <em>Transformer Maintenance Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerMaintenanceKind()
     * @generated
     * @ordered
     */
    protected static final TransformerMaintenanceKind TRANSFORMER_MAINTENANCE_KIND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTransformerMaintenanceKind() <em>Transformer Maintenance Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerMaintenanceKind()
     * @generated
     * @ordered
     */
    protected TransformerMaintenanceKind transformerMaintenanceKind = TRANSFORMER_MAINTENANCE_KIND_EDEFAULT;

    /**
     * This is true if the Transformer Maintenance Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transformerMaintenanceKindESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MaintenanceWorkTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMaintenanceWorkTask();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BreakerMaintenanceKind getBreakerMaintenanceKind() {
        return breakerMaintenanceKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBreakerMaintenanceKind( BreakerMaintenanceKind newBreakerMaintenanceKind ) {
        BreakerMaintenanceKind oldBreakerMaintenanceKind = breakerMaintenanceKind;
        breakerMaintenanceKind = newBreakerMaintenanceKind == null ? BREAKER_MAINTENANCE_KIND_EDEFAULT
                : newBreakerMaintenanceKind;
        boolean oldBreakerMaintenanceKindESet = breakerMaintenanceKindESet;
        breakerMaintenanceKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MAINTENANCE_WORK_TASK__BREAKER_MAINTENANCE_KIND, oldBreakerMaintenanceKind,
                breakerMaintenanceKind, !oldBreakerMaintenanceKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBreakerMaintenanceKind() {
        BreakerMaintenanceKind oldBreakerMaintenanceKind = breakerMaintenanceKind;
        boolean oldBreakerMaintenanceKindESet = breakerMaintenanceKindESet;
        breakerMaintenanceKind = BREAKER_MAINTENANCE_KIND_EDEFAULT;
        breakerMaintenanceKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MAINTENANCE_WORK_TASK__BREAKER_MAINTENANCE_KIND, oldBreakerMaintenanceKind,
                BREAKER_MAINTENANCE_KIND_EDEFAULT, oldBreakerMaintenanceKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBreakerMaintenanceKind() {
        return breakerMaintenanceKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerMaintenanceKind getTransformerMaintenanceKind() {
        return transformerMaintenanceKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransformerMaintenanceKind( TransformerMaintenanceKind newTransformerMaintenanceKind ) {
        TransformerMaintenanceKind oldTransformerMaintenanceKind = transformerMaintenanceKind;
        transformerMaintenanceKind = newTransformerMaintenanceKind == null ? TRANSFORMER_MAINTENANCE_KIND_EDEFAULT
                : newTransformerMaintenanceKind;
        boolean oldTransformerMaintenanceKindESet = transformerMaintenanceKindESet;
        transformerMaintenanceKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MAINTENANCE_WORK_TASK__TRANSFORMER_MAINTENANCE_KIND, oldTransformerMaintenanceKind,
                transformerMaintenanceKind, !oldTransformerMaintenanceKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerMaintenanceKind() {
        TransformerMaintenanceKind oldTransformerMaintenanceKind = transformerMaintenanceKind;
        boolean oldTransformerMaintenanceKindESet = transformerMaintenanceKindESet;
        transformerMaintenanceKind = TRANSFORMER_MAINTENANCE_KIND_EDEFAULT;
        transformerMaintenanceKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MAINTENANCE_WORK_TASK__TRANSFORMER_MAINTENANCE_KIND, oldTransformerMaintenanceKind,
                TRANSFORMER_MAINTENANCE_KIND_EDEFAULT, oldTransformerMaintenanceKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerMaintenanceKind() {
        return transformerMaintenanceKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.MAINTENANCE_WORK_TASK__BREAKER_MAINTENANCE_KIND:
            return getBreakerMaintenanceKind();
        case CimPackage.MAINTENANCE_WORK_TASK__TRANSFORMER_MAINTENANCE_KIND:
            return getTransformerMaintenanceKind();
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
        case CimPackage.MAINTENANCE_WORK_TASK__BREAKER_MAINTENANCE_KIND:
            setBreakerMaintenanceKind( ( BreakerMaintenanceKind ) newValue );
            return;
        case CimPackage.MAINTENANCE_WORK_TASK__TRANSFORMER_MAINTENANCE_KIND:
            setTransformerMaintenanceKind( ( TransformerMaintenanceKind ) newValue );
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
        case CimPackage.MAINTENANCE_WORK_TASK__BREAKER_MAINTENANCE_KIND:
            unsetBreakerMaintenanceKind();
            return;
        case CimPackage.MAINTENANCE_WORK_TASK__TRANSFORMER_MAINTENANCE_KIND:
            unsetTransformerMaintenanceKind();
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
        case CimPackage.MAINTENANCE_WORK_TASK__BREAKER_MAINTENANCE_KIND:
            return isSetBreakerMaintenanceKind();
        case CimPackage.MAINTENANCE_WORK_TASK__TRANSFORMER_MAINTENANCE_KIND:
            return isSetTransformerMaintenanceKind();
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
        result.append( " (breakerMaintenanceKind: " );
        if( breakerMaintenanceKindESet )
            result.append( breakerMaintenanceKind );
        else
            result.append( "<unset>" );
        result.append( ", transformerMaintenanceKind: " );
        if( transformerMaintenanceKindESet )
            result.append( transformerMaintenanceKind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MaintenanceWorkTaskImpl
