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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone;

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
 * An implementation of the model object '<em><b>Power Cut Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerCutZoneImpl#getCutLevel1 <em>Cut Level1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerCutZoneImpl#getCutLevel2 <em>Cut Level2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerCutZoneImpl#getEnergyConsumers <em>Energy Consumers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerCutZoneImpl extends PowerSystemResourceImpl implements PowerCutZone {
    /**
     * The default value of the '{@link #getCutLevel1() <em>Cut Level1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCutLevel1()
     * @generated
     * @ordered
     */
    protected static final Float CUT_LEVEL1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCutLevel1() <em>Cut Level1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCutLevel1()
     * @generated
     * @ordered
     */
    protected Float cutLevel1 = CUT_LEVEL1_EDEFAULT;

    /**
     * This is true if the Cut Level1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cutLevel1ESet;

    /**
     * The default value of the '{@link #getCutLevel2() <em>Cut Level2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCutLevel2()
     * @generated
     * @ordered
     */
    protected static final Float CUT_LEVEL2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCutLevel2() <em>Cut Level2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCutLevel2()
     * @generated
     * @ordered
     */
    protected Float cutLevel2 = CUT_LEVEL2_EDEFAULT;

    /**
     * This is true if the Cut Level2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cutLevel2ESet;

    /**
     * The cached value of the '{@link #getEnergyConsumers() <em>Energy Consumers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyConsumers()
     * @generated
     * @ordered
     */
    protected EList< EnergyConsumer > energyConsumers;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerCutZoneImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerCutZone();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCutLevel1() {
        return cutLevel1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCutLevel1( Float newCutLevel1 ) {
        Float oldCutLevel1 = cutLevel1;
        cutLevel1 = newCutLevel1;
        boolean oldCutLevel1ESet = cutLevel1ESet;
        cutLevel1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_CUT_ZONE__CUT_LEVEL1, oldCutLevel1, cutLevel1, !oldCutLevel1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCutLevel1() {
        Float oldCutLevel1 = cutLevel1;
        boolean oldCutLevel1ESet = cutLevel1ESet;
        cutLevel1 = CUT_LEVEL1_EDEFAULT;
        cutLevel1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_CUT_ZONE__CUT_LEVEL1, oldCutLevel1, CUT_LEVEL1_EDEFAULT, oldCutLevel1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCutLevel1() {
        return cutLevel1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCutLevel2() {
        return cutLevel2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCutLevel2( Float newCutLevel2 ) {
        Float oldCutLevel2 = cutLevel2;
        cutLevel2 = newCutLevel2;
        boolean oldCutLevel2ESet = cutLevel2ESet;
        cutLevel2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_CUT_ZONE__CUT_LEVEL2, oldCutLevel2, cutLevel2, !oldCutLevel2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCutLevel2() {
        Float oldCutLevel2 = cutLevel2;
        boolean oldCutLevel2ESet = cutLevel2ESet;
        cutLevel2 = CUT_LEVEL2_EDEFAULT;
        cutLevel2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_CUT_ZONE__CUT_LEVEL2, oldCutLevel2, CUT_LEVEL2_EDEFAULT, oldCutLevel2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCutLevel2() {
        return cutLevel2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EnergyConsumer > getEnergyConsumers() {
        if( energyConsumers == null ) {
            energyConsumers = new EObjectWithInverseResolvingEList.Unsettable< EnergyConsumer >( EnergyConsumer.class,
                    this, CimPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, CimPackage.ENERGY_CONSUMER__POWER_CUT_ZONE );
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
        case CimPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
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
        case CimPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
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
        case CimPackage.POWER_CUT_ZONE__CUT_LEVEL1:
            return getCutLevel1();
        case CimPackage.POWER_CUT_ZONE__CUT_LEVEL2:
            return getCutLevel2();
        case CimPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
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
        case CimPackage.POWER_CUT_ZONE__CUT_LEVEL1:
            setCutLevel1( ( Float ) newValue );
            return;
        case CimPackage.POWER_CUT_ZONE__CUT_LEVEL2:
            setCutLevel2( ( Float ) newValue );
            return;
        case CimPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
            getEnergyConsumers().clear();
            getEnergyConsumers().addAll( ( Collection< ? extends EnergyConsumer > ) newValue );
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
        case CimPackage.POWER_CUT_ZONE__CUT_LEVEL1:
            unsetCutLevel1();
            return;
        case CimPackage.POWER_CUT_ZONE__CUT_LEVEL2:
            unsetCutLevel2();
            return;
        case CimPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
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
        case CimPackage.POWER_CUT_ZONE__CUT_LEVEL1:
            return isSetCutLevel1();
        case CimPackage.POWER_CUT_ZONE__CUT_LEVEL2:
            return isSetCutLevel2();
        case CimPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
            return isSetEnergyConsumers();
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
        result.append( " (cutLevel1: " );
        if( cutLevel1ESet )
            result.append( cutLevel1 );
        else
            result.append( "<unset>" );
        result.append( ", cutLevel2: " );
        if( cutLevel2ESet )
            result.append( cutLevel2 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PowerCutZoneImpl
