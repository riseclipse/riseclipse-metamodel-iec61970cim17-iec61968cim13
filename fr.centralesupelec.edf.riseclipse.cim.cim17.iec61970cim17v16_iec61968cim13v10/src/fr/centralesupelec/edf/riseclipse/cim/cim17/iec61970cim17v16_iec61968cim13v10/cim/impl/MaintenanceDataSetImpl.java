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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceDataSet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintenance Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MaintenanceDataSetImpl#getConditionAfter <em>Condition After</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MaintenanceDataSetImpl#getConditionBefore <em>Condition Before</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MaintenanceDataSetImpl#getMaintCode <em>Maint Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaintenanceDataSetImpl extends ProcedureDataSetImpl implements MaintenanceDataSet {
    /**
     * The default value of the '{@link #getConditionAfter() <em>Condition After</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditionAfter()
     * @generated
     * @ordered
     */
    protected static final String CONDITION_AFTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConditionAfter() <em>Condition After</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditionAfter()
     * @generated
     * @ordered
     */
    protected String conditionAfter = CONDITION_AFTER_EDEFAULT;

    /**
     * This is true if the Condition After attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean conditionAfterESet;

    /**
     * The default value of the '{@link #getConditionBefore() <em>Condition Before</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditionBefore()
     * @generated
     * @ordered
     */
    protected static final String CONDITION_BEFORE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConditionBefore() <em>Condition Before</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditionBefore()
     * @generated
     * @ordered
     */
    protected String conditionBefore = CONDITION_BEFORE_EDEFAULT;

    /**
     * This is true if the Condition Before attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean conditionBeforeESet;

    /**
     * The default value of the '{@link #getMaintCode() <em>Maint Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaintCode()
     * @generated
     * @ordered
     */
    protected static final String MAINT_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaintCode() <em>Maint Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaintCode()
     * @generated
     * @ordered
     */
    protected String maintCode = MAINT_CODE_EDEFAULT;

    /**
     * This is true if the Maint Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maintCodeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MaintenanceDataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMaintenanceDataSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getConditionAfter() {
        return conditionAfter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConditionAfter( String newConditionAfter ) {
        String oldConditionAfter = conditionAfter;
        conditionAfter = newConditionAfter;
        boolean oldConditionAfterESet = conditionAfterESet;
        conditionAfterESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER,
                    oldConditionAfter, conditionAfter, !oldConditionAfterESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConditionAfter() {
        String oldConditionAfter = conditionAfter;
        boolean oldConditionAfterESet = conditionAfterESet;
        conditionAfter = CONDITION_AFTER_EDEFAULT;
        conditionAfterESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER,
                    oldConditionAfter, CONDITION_AFTER_EDEFAULT, oldConditionAfterESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConditionAfter() {
        return conditionAfterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getConditionBefore() {
        return conditionBefore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConditionBefore( String newConditionBefore ) {
        String oldConditionBefore = conditionBefore;
        conditionBefore = newConditionBefore;
        boolean oldConditionBeforeESet = conditionBeforeESet;
        conditionBeforeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE,
                    oldConditionBefore, conditionBefore, !oldConditionBeforeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConditionBefore() {
        String oldConditionBefore = conditionBefore;
        boolean oldConditionBeforeESet = conditionBeforeESet;
        conditionBefore = CONDITION_BEFORE_EDEFAULT;
        conditionBeforeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE,
                    oldConditionBefore, CONDITION_BEFORE_EDEFAULT, oldConditionBeforeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConditionBefore() {
        return conditionBeforeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMaintCode() {
        return maintCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaintCode( String newMaintCode ) {
        String oldMaintCode = maintCode;
        maintCode = newMaintCode;
        boolean oldMaintCodeESet = maintCodeESet;
        maintCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MAINTENANCE_DATA_SET__MAINT_CODE, oldMaintCode, maintCode, !oldMaintCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaintCode() {
        String oldMaintCode = maintCode;
        boolean oldMaintCodeESet = maintCodeESet;
        maintCode = MAINT_CODE_EDEFAULT;
        maintCodeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MAINTENANCE_DATA_SET__MAINT_CODE, oldMaintCode, MAINT_CODE_EDEFAULT, oldMaintCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaintCode() {
        return maintCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
            return getConditionAfter();
        case CimPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
            return getConditionBefore();
        case CimPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
            return getMaintCode();
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
        case CimPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
            setConditionAfter( ( String ) newValue );
            return;
        case CimPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
            setConditionBefore( ( String ) newValue );
            return;
        case CimPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
            setMaintCode( ( String ) newValue );
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
        case CimPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
            unsetConditionAfter();
            return;
        case CimPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
            unsetConditionBefore();
            return;
        case CimPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
            unsetMaintCode();
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
        case CimPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
            return isSetConditionAfter();
        case CimPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
            return isSetConditionBefore();
        case CimPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
            return isSetMaintCode();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (conditionAfter: " );
        if( conditionAfterESet )
            result.append( conditionAfter );
        else
            result.append( "<unset>" );
        result.append( ", conditionBefore: " );
        if( conditionBeforeESet )
            result.append( conditionBefore );
        else
            result.append( "<unset>" );
        result.append( ", maintCode: " );
        if( maintCodeESet )
            result.append( maintCode );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MaintenanceDataSetImpl
