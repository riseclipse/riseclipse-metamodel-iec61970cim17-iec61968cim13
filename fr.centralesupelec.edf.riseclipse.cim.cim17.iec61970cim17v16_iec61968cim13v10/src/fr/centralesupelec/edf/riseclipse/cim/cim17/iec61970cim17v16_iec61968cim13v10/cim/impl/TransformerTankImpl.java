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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTank;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankEnd;

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
 * An implementation of the model object '<em><b>Transformer Tank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerTankImpl#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerTankImpl#getTransformerTankEnds <em>Transformer Tank Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerTankImpl extends EquipmentImpl implements TransformerTank {
    /**
     * The cached value of the '{@link #getPowerTransformer() <em>Power Transformer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerTransformer()
     * @generated
     * @ordered
     */
    protected PowerTransformer powerTransformer;

    /**
     * This is true if the Power Transformer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerTransformerESet;

    /**
     * The cached value of the '{@link #getTransformerTankEnds() <em>Transformer Tank Ends</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerTankEnds()
     * @generated
     * @ordered
     */
    protected EList< TransformerTankEnd > transformerTankEnds;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformerTankImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTransformerTank();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerTransformer getPowerTransformer() {
        return powerTransformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerTransformer( PowerTransformer newPowerTransformer, NotificationChain msgs ) {
        PowerTransformer oldPowerTransformer = powerTransformer;
        powerTransformer = newPowerTransformer;
        boolean oldPowerTransformerESet = powerTransformerESet;
        powerTransformerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_TANK__POWER_TRANSFORMER, oldPowerTransformer, newPowerTransformer,
                    !oldPowerTransformerESet );
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
    public void setPowerTransformer( PowerTransformer newPowerTransformer ) {
        if( newPowerTransformer != powerTransformer ) {
            NotificationChain msgs = null;
            if( powerTransformer != null ) msgs = ( ( InternalEObject ) powerTransformer ).eInverseRemove( this,
                    CimPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS, PowerTransformer.class, msgs );
            if( newPowerTransformer != null ) msgs = ( ( InternalEObject ) newPowerTransformer ).eInverseAdd( this,
                    CimPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS, PowerTransformer.class, msgs );
            msgs = basicSetPowerTransformer( newPowerTransformer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerTransformerESet = powerTransformerESet;
            powerTransformerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_TANK__POWER_TRANSFORMER,
                        newPowerTransformer, newPowerTransformer, !oldPowerTransformerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerTransformer( NotificationChain msgs ) {
        PowerTransformer oldPowerTransformer = powerTransformer;
        powerTransformer = null;
        boolean oldPowerTransformerESet = powerTransformerESet;
        powerTransformerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_TANK__POWER_TRANSFORMER, oldPowerTransformer, null,
                    oldPowerTransformerESet );
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
    public void unsetPowerTransformer() {
        if( powerTransformer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerTransformer ).eInverseRemove( this,
                    CimPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS, PowerTransformer.class, msgs );
            msgs = basicUnsetPowerTransformer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerTransformerESet = powerTransformerESet;
            powerTransformerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_TANK__POWER_TRANSFORMER, null, null, oldPowerTransformerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerTransformer() {
        return powerTransformerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerTankEnd > getTransformerTankEnds() {
        if( transformerTankEnds == null ) {
            transformerTankEnds = new EObjectWithInverseResolvingEList.Unsettable< TransformerTankEnd >(
                    TransformerTankEnd.class, this, CimPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS,
                    CimPackage.TRANSFORMER_TANK_END__TRANSFORMER_TANK );
        }
        return transformerTankEnds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerTankEnds() {
        if( transformerTankEnds != null ) ( ( InternalEList.Unsettable< ? > ) transformerTankEnds ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerTankEnds() {
        return transformerTankEnds != null && ( ( InternalEList.Unsettable< ? > ) transformerTankEnds ).isSet();
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
        case CimPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
            if( powerTransformer != null ) msgs = ( ( InternalEObject ) powerTransformer ).eInverseRemove( this,
                    CimPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS, PowerTransformer.class, msgs );
            return basicSetPowerTransformer( ( PowerTransformer ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransformerTankEnds() )
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
        case CimPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
            return basicUnsetPowerTransformer( msgs );
        case CimPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
            return ( ( InternalEList< ? > ) getTransformerTankEnds() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
            return getPowerTransformer();
        case CimPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
            return getTransformerTankEnds();
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
        case CimPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
            setPowerTransformer( ( PowerTransformer ) newValue );
            return;
        case CimPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
            getTransformerTankEnds().clear();
            getTransformerTankEnds().addAll( ( Collection< ? extends TransformerTankEnd > ) newValue );
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
        case CimPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
            unsetPowerTransformer();
            return;
        case CimPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
            unsetTransformerTankEnds();
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
        case CimPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
            return isSetPowerTransformer();
        case CimPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
            return isSetTransformerTankEnds();
        }
        return super.eIsSet( featureID );
    }

} //TransformerTankImpl
