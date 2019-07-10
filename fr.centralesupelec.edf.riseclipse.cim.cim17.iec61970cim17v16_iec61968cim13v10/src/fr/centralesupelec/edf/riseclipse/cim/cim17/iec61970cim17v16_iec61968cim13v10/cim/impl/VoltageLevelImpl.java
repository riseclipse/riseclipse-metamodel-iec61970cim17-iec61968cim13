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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Substation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageLevel;

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
 * An implementation of the model object '<em><b>Voltage Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VoltageLevelImpl#getHighVoltageLimit <em>High Voltage Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VoltageLevelImpl#getLowVoltageLimit <em>Low Voltage Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VoltageLevelImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VoltageLevelImpl#getBays <em>Bays</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VoltageLevelImpl#getSubstation <em>Substation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoltageLevelImpl extends EquipmentContainerImpl implements VoltageLevel {
    /**
     * The default value of the '{@link #getHighVoltageLimit() <em>High Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighVoltageLimit()
     * @generated
     * @ordered
     */
    protected static final Float HIGH_VOLTAGE_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHighVoltageLimit() <em>High Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighVoltageLimit()
     * @generated
     * @ordered
     */
    protected Float highVoltageLimit = HIGH_VOLTAGE_LIMIT_EDEFAULT;

    /**
     * This is true if the High Voltage Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean highVoltageLimitESet;

    /**
     * The default value of the '{@link #getLowVoltageLimit() <em>Low Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowVoltageLimit()
     * @generated
     * @ordered
     */
    protected static final Float LOW_VOLTAGE_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowVoltageLimit() <em>Low Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowVoltageLimit()
     * @generated
     * @ordered
     */
    protected Float lowVoltageLimit = LOW_VOLTAGE_LIMIT_EDEFAULT;

    /**
     * This is true if the Low Voltage Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowVoltageLimitESet;

    /**
     * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseVoltage()
     * @generated
     * @ordered
     */
    protected BaseVoltage baseVoltage;

    /**
     * This is true if the Base Voltage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseVoltageESet;

    /**
     * The cached value of the '{@link #getBays() <em>Bays</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBays()
     * @generated
     * @ordered
     */
    protected EList< Bay > bays;

    /**
     * The cached value of the '{@link #getSubstation() <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubstation()
     * @generated
     * @ordered
     */
    protected Substation substation;

    /**
     * This is true if the Substation reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean substationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VoltageLevelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVoltageLevel();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHighVoltageLimit() {
        return highVoltageLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHighVoltageLimit( Float newHighVoltageLimit ) {
        Float oldHighVoltageLimit = highVoltageLimit;
        highVoltageLimit = newHighVoltageLimit;
        boolean oldHighVoltageLimitESet = highVoltageLimitESet;
        highVoltageLimitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT,
                    oldHighVoltageLimit, highVoltageLimit, !oldHighVoltageLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHighVoltageLimit() {
        Float oldHighVoltageLimit = highVoltageLimit;
        boolean oldHighVoltageLimitESet = highVoltageLimitESet;
        highVoltageLimit = HIGH_VOLTAGE_LIMIT_EDEFAULT;
        highVoltageLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT,
                    oldHighVoltageLimit, HIGH_VOLTAGE_LIMIT_EDEFAULT, oldHighVoltageLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHighVoltageLimit() {
        return highVoltageLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLowVoltageLimit() {
        return lowVoltageLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowVoltageLimit( Float newLowVoltageLimit ) {
        Float oldLowVoltageLimit = lowVoltageLimit;
        lowVoltageLimit = newLowVoltageLimit;
        boolean oldLowVoltageLimitESet = lowVoltageLimitESet;
        lowVoltageLimitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT,
                    oldLowVoltageLimit, lowVoltageLimit, !oldLowVoltageLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowVoltageLimit() {
        Float oldLowVoltageLimit = lowVoltageLimit;
        boolean oldLowVoltageLimitESet = lowVoltageLimitESet;
        lowVoltageLimit = LOW_VOLTAGE_LIMIT_EDEFAULT;
        lowVoltageLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT,
                    oldLowVoltageLimit, LOW_VOLTAGE_LIMIT_EDEFAULT, oldLowVoltageLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowVoltageLimit() {
        return lowVoltageLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseVoltage getBaseVoltage() {
        return baseVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseVoltage( BaseVoltage newBaseVoltage, NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = newBaseVoltage;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VOLTAGE_LEVEL__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage, !oldBaseVoltageESet );
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
    public void setBaseVoltage( BaseVoltage newBaseVoltage ) {
        if( newBaseVoltage != baseVoltage ) {
            NotificationChain msgs = null;
            if( baseVoltage != null ) msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs );
            if( newBaseVoltage != null ) msgs = ( ( InternalEObject ) newBaseVoltage ).eInverseAdd( this,
                    CimPackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs );
            msgs = basicSetBaseVoltage( newBaseVoltage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.VOLTAGE_LEVEL__BASE_VOLTAGE, newBaseVoltage, newBaseVoltage, !oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBaseVoltage( NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = null;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VOLTAGE_LEVEL__BASE_VOLTAGE, oldBaseVoltage, null, oldBaseVoltageESet );
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
    public void unsetBaseVoltage() {
        if( baseVoltage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this, CimPackage.BASE_VOLTAGE__VOLTAGE_LEVEL,
                    BaseVoltage.class, msgs );
            msgs = basicUnsetBaseVoltage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VOLTAGE_LEVEL__BASE_VOLTAGE, null, null, oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaseVoltage() {
        return baseVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Bay > getBays() {
        if( bays == null ) {
            bays = new EObjectWithInverseResolvingEList.Unsettable< Bay >( Bay.class, this,
                    CimPackage.VOLTAGE_LEVEL__BAYS, CimPackage.BAY__VOLTAGE_LEVEL );
        }
        return bays;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBays() {
        if( bays != null ) ( ( InternalEList.Unsettable< ? > ) bays ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBays() {
        return bays != null && ( ( InternalEList.Unsettable< ? > ) bays ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Substation getSubstation() {
        return substation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubstation( Substation newSubstation, NotificationChain msgs ) {
        Substation oldSubstation = substation;
        substation = newSubstation;
        boolean oldSubstationESet = substationESet;
        substationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VOLTAGE_LEVEL__SUBSTATION, oldSubstation, newSubstation, !oldSubstationESet );
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
    public void setSubstation( Substation newSubstation ) {
        if( newSubstation != substation ) {
            NotificationChain msgs = null;
            if( substation != null ) msgs = ( ( InternalEObject ) substation ).eInverseRemove( this,
                    CimPackage.SUBSTATION__VOLTAGE_LEVELS, Substation.class, msgs );
            if( newSubstation != null ) msgs = ( ( InternalEObject ) newSubstation ).eInverseAdd( this,
                    CimPackage.SUBSTATION__VOLTAGE_LEVELS, Substation.class, msgs );
            msgs = basicSetSubstation( newSubstation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubstationESet = substationESet;
            substationESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.VOLTAGE_LEVEL__SUBSTATION, newSubstation, newSubstation, !oldSubstationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSubstation( NotificationChain msgs ) {
        Substation oldSubstation = substation;
        substation = null;
        boolean oldSubstationESet = substationESet;
        substationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VOLTAGE_LEVEL__SUBSTATION, oldSubstation, null, oldSubstationESet );
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
    public void unsetSubstation() {
        if( substation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) substation ).eInverseRemove( this, CimPackage.SUBSTATION__VOLTAGE_LEVELS,
                    Substation.class, msgs );
            msgs = basicUnsetSubstation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubstationESet = substationESet;
            substationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VOLTAGE_LEVEL__SUBSTATION, null, null, oldSubstationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubstation() {
        return substationESet;
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
        case CimPackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
            if( baseVoltage != null ) msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs );
            return basicSetBaseVoltage( ( BaseVoltage ) otherEnd, msgs );
        case CimPackage.VOLTAGE_LEVEL__BAYS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBays() ).basicAdd( otherEnd, msgs );
        case CimPackage.VOLTAGE_LEVEL__SUBSTATION:
            if( substation != null ) msgs = ( ( InternalEObject ) substation ).eInverseRemove( this,
                    CimPackage.SUBSTATION__VOLTAGE_LEVELS, Substation.class, msgs );
            return basicSetSubstation( ( Substation ) otherEnd, msgs );
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
        case CimPackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
            return basicUnsetBaseVoltage( msgs );
        case CimPackage.VOLTAGE_LEVEL__BAYS:
            return ( ( InternalEList< ? > ) getBays() ).basicRemove( otherEnd, msgs );
        case CimPackage.VOLTAGE_LEVEL__SUBSTATION:
            return basicUnsetSubstation( msgs );
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
        case CimPackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
            return getHighVoltageLimit();
        case CimPackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
            return getLowVoltageLimit();
        case CimPackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
            return getBaseVoltage();
        case CimPackage.VOLTAGE_LEVEL__BAYS:
            return getBays();
        case CimPackage.VOLTAGE_LEVEL__SUBSTATION:
            return getSubstation();
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
        case CimPackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
            setHighVoltageLimit( ( Float ) newValue );
            return;
        case CimPackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
            setLowVoltageLimit( ( Float ) newValue );
            return;
        case CimPackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
            setBaseVoltage( ( BaseVoltage ) newValue );
            return;
        case CimPackage.VOLTAGE_LEVEL__BAYS:
            getBays().clear();
            getBays().addAll( ( Collection< ? extends Bay > ) newValue );
            return;
        case CimPackage.VOLTAGE_LEVEL__SUBSTATION:
            setSubstation( ( Substation ) newValue );
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
        case CimPackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
            unsetHighVoltageLimit();
            return;
        case CimPackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
            unsetLowVoltageLimit();
            return;
        case CimPackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
            unsetBaseVoltage();
            return;
        case CimPackage.VOLTAGE_LEVEL__BAYS:
            unsetBays();
            return;
        case CimPackage.VOLTAGE_LEVEL__SUBSTATION:
            unsetSubstation();
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
        case CimPackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
            return isSetHighVoltageLimit();
        case CimPackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
            return isSetLowVoltageLimit();
        case CimPackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
            return isSetBaseVoltage();
        case CimPackage.VOLTAGE_LEVEL__BAYS:
            return isSetBays();
        case CimPackage.VOLTAGE_LEVEL__SUBSTATION:
            return isSetSubstation();
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
        result.append( " (highVoltageLimit: " );
        if( highVoltageLimitESet )
            result.append( highVoltageLimit );
        else
            result.append( "<unset>" );
        result.append( ", lowVoltageLimit: " );
        if( lowVoltageLimitESet )
            result.append( lowVoltageLimit );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //VoltageLevelImpl
