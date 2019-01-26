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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroupTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

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
 * An implementation of the model object '<em><b>Branch Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BranchGroupImpl#getMaximumActivePower <em>Maximum Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BranchGroupImpl#getMaximumReactivePower <em>Maximum Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BranchGroupImpl#getMinimumActivePower <em>Minimum Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BranchGroupImpl#getMinimumReactivePower <em>Minimum Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BranchGroupImpl#getMonitorActivePower <em>Monitor Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BranchGroupImpl#getMonitorReactivePower <em>Monitor Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BranchGroupImpl#getBranchGroupTerminal <em>Branch Group Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchGroupImpl extends IdentifiedObjectImpl implements BranchGroup {
    /**
     * The default value of the '{@link #getMaximumActivePower() <em>Maximum Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumActivePower()
     * @generated
     * @ordered
     */
    protected static final Float MAXIMUM_ACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaximumActivePower() <em>Maximum Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumActivePower()
     * @generated
     * @ordered
     */
    protected Float maximumActivePower = MAXIMUM_ACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Maximum Active Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maximumActivePowerESet;

    /**
     * The default value of the '{@link #getMaximumReactivePower() <em>Maximum Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumReactivePower()
     * @generated
     * @ordered
     */
    protected static final Float MAXIMUM_REACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaximumReactivePower() <em>Maximum Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumReactivePower()
     * @generated
     * @ordered
     */
    protected Float maximumReactivePower = MAXIMUM_REACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Maximum Reactive Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maximumReactivePowerESet;

    /**
     * The default value of the '{@link #getMinimumActivePower() <em>Minimum Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumActivePower()
     * @generated
     * @ordered
     */
    protected static final Float MINIMUM_ACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinimumActivePower() <em>Minimum Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumActivePower()
     * @generated
     * @ordered
     */
    protected Float minimumActivePower = MINIMUM_ACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Minimum Active Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minimumActivePowerESet;

    /**
     * The default value of the '{@link #getMinimumReactivePower() <em>Minimum Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumReactivePower()
     * @generated
     * @ordered
     */
    protected static final Float MINIMUM_REACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinimumReactivePower() <em>Minimum Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumReactivePower()
     * @generated
     * @ordered
     */
    protected Float minimumReactivePower = MINIMUM_REACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Minimum Reactive Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minimumReactivePowerESet;

    /**
     * The default value of the '{@link #getMonitorActivePower() <em>Monitor Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonitorActivePower()
     * @generated
     * @ordered
     */
    protected static final Boolean MONITOR_ACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMonitorActivePower() <em>Monitor Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonitorActivePower()
     * @generated
     * @ordered
     */
    protected Boolean monitorActivePower = MONITOR_ACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Monitor Active Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean monitorActivePowerESet;

    /**
     * The default value of the '{@link #getMonitorReactivePower() <em>Monitor Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonitorReactivePower()
     * @generated
     * @ordered
     */
    protected static final Boolean MONITOR_REACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMonitorReactivePower() <em>Monitor Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonitorReactivePower()
     * @generated
     * @ordered
     */
    protected Boolean monitorReactivePower = MONITOR_REACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Monitor Reactive Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean monitorReactivePowerESet;

    /**
     * The cached value of the '{@link #getBranchGroupTerminal() <em>Branch Group Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranchGroupTerminal()
     * @generated
     * @ordered
     */
    protected EList< BranchGroupTerminal > branchGroupTerminal;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BranchGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBranchGroup();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaximumActivePower() {
        return maximumActivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaximumActivePower( Float newMaximumActivePower ) {
        Float oldMaximumActivePower = maximumActivePower;
        maximumActivePower = newMaximumActivePower;
        boolean oldMaximumActivePowerESet = maximumActivePowerESet;
        maximumActivePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER,
                    oldMaximumActivePower, maximumActivePower, !oldMaximumActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaximumActivePower() {
        Float oldMaximumActivePower = maximumActivePower;
        boolean oldMaximumActivePowerESet = maximumActivePowerESet;
        maximumActivePower = MAXIMUM_ACTIVE_POWER_EDEFAULT;
        maximumActivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER,
                    oldMaximumActivePower, MAXIMUM_ACTIVE_POWER_EDEFAULT, oldMaximumActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaximumActivePower() {
        return maximumActivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaximumReactivePower() {
        return maximumReactivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaximumReactivePower( Float newMaximumReactivePower ) {
        Float oldMaximumReactivePower = maximumReactivePower;
        maximumReactivePower = newMaximumReactivePower;
        boolean oldMaximumReactivePowerESet = maximumReactivePowerESet;
        maximumReactivePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER,
                    oldMaximumReactivePower, maximumReactivePower, !oldMaximumReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaximumReactivePower() {
        Float oldMaximumReactivePower = maximumReactivePower;
        boolean oldMaximumReactivePowerESet = maximumReactivePowerESet;
        maximumReactivePower = MAXIMUM_REACTIVE_POWER_EDEFAULT;
        maximumReactivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER,
                    oldMaximumReactivePower, MAXIMUM_REACTIVE_POWER_EDEFAULT, oldMaximumReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaximumReactivePower() {
        return maximumReactivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinimumActivePower() {
        return minimumActivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinimumActivePower( Float newMinimumActivePower ) {
        Float oldMinimumActivePower = minimumActivePower;
        minimumActivePower = newMinimumActivePower;
        boolean oldMinimumActivePowerESet = minimumActivePowerESet;
        minimumActivePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER,
                    oldMinimumActivePower, minimumActivePower, !oldMinimumActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinimumActivePower() {
        Float oldMinimumActivePower = minimumActivePower;
        boolean oldMinimumActivePowerESet = minimumActivePowerESet;
        minimumActivePower = MINIMUM_ACTIVE_POWER_EDEFAULT;
        minimumActivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER,
                    oldMinimumActivePower, MINIMUM_ACTIVE_POWER_EDEFAULT, oldMinimumActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinimumActivePower() {
        return minimumActivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinimumReactivePower() {
        return minimumReactivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinimumReactivePower( Float newMinimumReactivePower ) {
        Float oldMinimumReactivePower = minimumReactivePower;
        minimumReactivePower = newMinimumReactivePower;
        boolean oldMinimumReactivePowerESet = minimumReactivePowerESet;
        minimumReactivePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER,
                    oldMinimumReactivePower, minimumReactivePower, !oldMinimumReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinimumReactivePower() {
        Float oldMinimumReactivePower = minimumReactivePower;
        boolean oldMinimumReactivePowerESet = minimumReactivePowerESet;
        minimumReactivePower = MINIMUM_REACTIVE_POWER_EDEFAULT;
        minimumReactivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER,
                    oldMinimumReactivePower, MINIMUM_REACTIVE_POWER_EDEFAULT, oldMinimumReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinimumReactivePower() {
        return minimumReactivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMonitorActivePower() {
        return monitorActivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMonitorActivePower( Boolean newMonitorActivePower ) {
        Boolean oldMonitorActivePower = monitorActivePower;
        monitorActivePower = newMonitorActivePower;
        boolean oldMonitorActivePowerESet = monitorActivePowerESet;
        monitorActivePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER,
                    oldMonitorActivePower, monitorActivePower, !oldMonitorActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMonitorActivePower() {
        Boolean oldMonitorActivePower = monitorActivePower;
        boolean oldMonitorActivePowerESet = monitorActivePowerESet;
        monitorActivePower = MONITOR_ACTIVE_POWER_EDEFAULT;
        monitorActivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER,
                    oldMonitorActivePower, MONITOR_ACTIVE_POWER_EDEFAULT, oldMonitorActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMonitorActivePower() {
        return monitorActivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMonitorReactivePower() {
        return monitorReactivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMonitorReactivePower( Boolean newMonitorReactivePower ) {
        Boolean oldMonitorReactivePower = monitorReactivePower;
        monitorReactivePower = newMonitorReactivePower;
        boolean oldMonitorReactivePowerESet = monitorReactivePowerESet;
        monitorReactivePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER,
                    oldMonitorReactivePower, monitorReactivePower, !oldMonitorReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMonitorReactivePower() {
        Boolean oldMonitorReactivePower = monitorReactivePower;
        boolean oldMonitorReactivePowerESet = monitorReactivePowerESet;
        monitorReactivePower = MONITOR_REACTIVE_POWER_EDEFAULT;
        monitorReactivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER,
                    oldMonitorReactivePower, MONITOR_REACTIVE_POWER_EDEFAULT, oldMonitorReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMonitorReactivePower() {
        return monitorReactivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BranchGroupTerminal > getBranchGroupTerminal() {
        if( branchGroupTerminal == null ) {
            branchGroupTerminal = new EObjectWithInverseResolvingEList.Unsettable< BranchGroupTerminal >(
                    BranchGroupTerminal.class, this, CimPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL,
                    CimPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP );
        }
        return branchGroupTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBranchGroupTerminal() {
        if( branchGroupTerminal != null ) ( ( InternalEList.Unsettable< ? > ) branchGroupTerminal ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBranchGroupTerminal() {
        return branchGroupTerminal != null && ( ( InternalEList.Unsettable< ? > ) branchGroupTerminal ).isSet();
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
        case CimPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBranchGroupTerminal() )
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
        case CimPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
            return ( ( InternalEList< ? > ) getBranchGroupTerminal() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
            return getMaximumActivePower();
        case CimPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
            return getMaximumReactivePower();
        case CimPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
            return getMinimumActivePower();
        case CimPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
            return getMinimumReactivePower();
        case CimPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
            return getMonitorActivePower();
        case CimPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
            return getMonitorReactivePower();
        case CimPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
            return getBranchGroupTerminal();
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
        case CimPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
            setMaximumActivePower( ( Float ) newValue );
            return;
        case CimPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
            setMaximumReactivePower( ( Float ) newValue );
            return;
        case CimPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
            setMinimumActivePower( ( Float ) newValue );
            return;
        case CimPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
            setMinimumReactivePower( ( Float ) newValue );
            return;
        case CimPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
            setMonitorActivePower( ( Boolean ) newValue );
            return;
        case CimPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
            setMonitorReactivePower( ( Boolean ) newValue );
            return;
        case CimPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
            getBranchGroupTerminal().clear();
            getBranchGroupTerminal().addAll( ( Collection< ? extends BranchGroupTerminal > ) newValue );
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
        case CimPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
            unsetMaximumActivePower();
            return;
        case CimPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
            unsetMaximumReactivePower();
            return;
        case CimPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
            unsetMinimumActivePower();
            return;
        case CimPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
            unsetMinimumReactivePower();
            return;
        case CimPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
            unsetMonitorActivePower();
            return;
        case CimPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
            unsetMonitorReactivePower();
            return;
        case CimPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
            unsetBranchGroupTerminal();
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
        case CimPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
            return isSetMaximumActivePower();
        case CimPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
            return isSetMaximumReactivePower();
        case CimPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
            return isSetMinimumActivePower();
        case CimPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
            return isSetMinimumReactivePower();
        case CimPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
            return isSetMonitorActivePower();
        case CimPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
            return isSetMonitorReactivePower();
        case CimPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
            return isSetBranchGroupTerminal();
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
        result.append( " (maximumActivePower: " );
        if( maximumActivePowerESet )
            result.append( maximumActivePower );
        else
            result.append( "<unset>" );
        result.append( ", maximumReactivePower: " );
        if( maximumReactivePowerESet )
            result.append( maximumReactivePower );
        else
            result.append( "<unset>" );
        result.append( ", minimumActivePower: " );
        if( minimumActivePowerESet )
            result.append( minimumActivePower );
        else
            result.append( "<unset>" );
        result.append( ", minimumReactivePower: " );
        if( minimumReactivePowerESet )
            result.append( minimumReactivePower );
        else
            result.append( "<unset>" );
        result.append( ", monitorActivePower: " );
        if( monitorActivePowerESet )
            result.append( monitorActivePower );
        else
            result.append( "<unset>" );
        result.append( ", monitorReactivePower: " );
        if( monitorReactivePowerESet )
            result.append( monitorReactivePower );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BranchGroupImpl
