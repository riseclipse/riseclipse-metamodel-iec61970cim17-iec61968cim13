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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DateTimeInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FloatQuantity;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel;

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
 * An implementation of the model object '<em><b>Operational Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalRestrictionImpl#getActivePeriod <em>Active Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalRestrictionImpl#getRestrictedValue <em>Restricted Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalRestrictionImpl#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalRestrictionImpl#getProductAssetModel <em>Product Asset Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalRestrictionImpl extends DocumentImpl implements OperationalRestriction {
    /**
     * The cached value of the '{@link #getActivePeriod() <em>Active Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivePeriod()
     * @generated
     * @ordered
     */
    protected DateTimeInterval activePeriod;

    /**
     * This is true if the Active Period containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean activePeriodESet;

    /**
     * The cached value of the '{@link #getRestrictedValue() <em>Restricted Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRestrictedValue()
     * @generated
     * @ordered
     */
    protected FloatQuantity restrictedValue;

    /**
     * This is true if the Restricted Value containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean restrictedValueESet;

    /**
     * The cached value of the '{@link #getEquipments() <em>Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquipments()
     * @generated
     * @ordered
     */
    protected EList< Equipment > equipments;

    /**
     * The cached value of the '{@link #getProductAssetModel() <em>Product Asset Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProductAssetModel()
     * @generated
     * @ordered
     */
    protected ProductAssetModel productAssetModel;

    /**
     * This is true if the Product Asset Model reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean productAssetModelESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationalRestrictionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOperationalRestriction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getActivePeriod() {
        return activePeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActivePeriod( DateTimeInterval newActivePeriod, NotificationChain msgs ) {
        DateTimeInterval oldActivePeriod = activePeriod;
        activePeriod = newActivePeriod;
        boolean oldActivePeriodESet = activePeriodESet;
        activePeriodESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD, oldActivePeriod, newActivePeriod,
                    !oldActivePeriodESet );
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
    public void setActivePeriod( DateTimeInterval newActivePeriod ) {
        if( newActivePeriod != activePeriod ) {
            NotificationChain msgs = null;
            if( activePeriod != null ) msgs = ( ( InternalEObject ) activePeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD, null, msgs );
            if( newActivePeriod != null ) msgs = ( ( InternalEObject ) newActivePeriod ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD, null, msgs );
            msgs = basicSetActivePeriod( newActivePeriod, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldActivePeriodESet = activePeriodESet;
            activePeriodESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD,
                            newActivePeriod, newActivePeriod, !oldActivePeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetActivePeriod( NotificationChain msgs ) {
        DateTimeInterval oldActivePeriod = activePeriod;
        activePeriod = null;
        boolean oldActivePeriodESet = activePeriodESet;
        activePeriodESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD, oldActivePeriod, null, oldActivePeriodESet );
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
    public void unsetActivePeriod() {
        if( activePeriod != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) activePeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD, null, msgs );
            msgs = basicUnsetActivePeriod( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldActivePeriodESet = activePeriodESet;
            activePeriodESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD, null, null, oldActivePeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActivePeriod() {
        return activePeriodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FloatQuantity getRestrictedValue() {
        return restrictedValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRestrictedValue( FloatQuantity newRestrictedValue, NotificationChain msgs ) {
        FloatQuantity oldRestrictedValue = restrictedValue;
        restrictedValue = newRestrictedValue;
        boolean oldRestrictedValueESet = restrictedValueESet;
        restrictedValueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE, oldRestrictedValue, newRestrictedValue,
                    !oldRestrictedValueESet );
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
    public void setRestrictedValue( FloatQuantity newRestrictedValue ) {
        if( newRestrictedValue != restrictedValue ) {
            NotificationChain msgs = null;
            if( restrictedValue != null ) msgs = ( ( InternalEObject ) restrictedValue ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE, null, msgs );
            if( newRestrictedValue != null ) msgs = ( ( InternalEObject ) newRestrictedValue ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE, null, msgs );
            msgs = basicSetRestrictedValue( newRestrictedValue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRestrictedValueESet = restrictedValueESet;
            restrictedValueESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE,
                            newRestrictedValue, newRestrictedValue, !oldRestrictedValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRestrictedValue( NotificationChain msgs ) {
        FloatQuantity oldRestrictedValue = restrictedValue;
        restrictedValue = null;
        boolean oldRestrictedValueESet = restrictedValueESet;
        restrictedValueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE, oldRestrictedValue, null,
                    oldRestrictedValueESet );
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
    public void unsetRestrictedValue() {
        if( restrictedValue != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) restrictedValue ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE, null, msgs );
            msgs = basicUnsetRestrictedValue( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRestrictedValueESet = restrictedValueESet;
            restrictedValueESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE, null, null, oldRestrictedValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRestrictedValue() {
        return restrictedValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Equipment > getEquipments() {
        if( equipments == null ) {
            equipments = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Equipment >( Equipment.class,
                    this, CimPackage.OPERATIONAL_RESTRICTION__EQUIPMENTS,
                    CimPackage.EQUIPMENT__OPERATIONAL_RESTRICTIONS );
        }
        return equipments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEquipments() {
        if( equipments != null ) ( ( InternalEList.Unsettable< ? > ) equipments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquipments() {
        return equipments != null && ( ( InternalEList.Unsettable< ? > ) equipments ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProductAssetModel getProductAssetModel() {
        return productAssetModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProductAssetModel( ProductAssetModel newProductAssetModel,
            NotificationChain msgs ) {
        ProductAssetModel oldProductAssetModel = productAssetModel;
        productAssetModel = newProductAssetModel;
        boolean oldProductAssetModelESet = productAssetModelESet;
        productAssetModelESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL, oldProductAssetModel, newProductAssetModel,
                    !oldProductAssetModelESet );
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
    public void setProductAssetModel( ProductAssetModel newProductAssetModel ) {
        if( newProductAssetModel != productAssetModel ) {
            NotificationChain msgs = null;
            if( productAssetModel != null ) msgs = ( ( InternalEObject ) productAssetModel ).eInverseRemove( this,
                    CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS, ProductAssetModel.class, msgs );
            if( newProductAssetModel != null ) msgs = ( ( InternalEObject ) newProductAssetModel ).eInverseAdd( this,
                    CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS, ProductAssetModel.class, msgs );
            msgs = basicSetProductAssetModel( newProductAssetModel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProductAssetModelESet = productAssetModelESet;
            productAssetModelESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL, newProductAssetModel, newProductAssetModel,
                    !oldProductAssetModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetProductAssetModel( NotificationChain msgs ) {
        ProductAssetModel oldProductAssetModel = productAssetModel;
        productAssetModel = null;
        boolean oldProductAssetModelESet = productAssetModelESet;
        productAssetModelESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL, oldProductAssetModel, null,
                    oldProductAssetModelESet );
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
    public void unsetProductAssetModel() {
        if( productAssetModel != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) productAssetModel ).eInverseRemove( this,
                    CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS, ProductAssetModel.class, msgs );
            msgs = basicUnsetProductAssetModel( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProductAssetModelESet = productAssetModelESet;
            productAssetModelESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL, null, null, oldProductAssetModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProductAssetModel() {
        return productAssetModelESet;
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
        case CimPackage.OPERATIONAL_RESTRICTION__EQUIPMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEquipments() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL:
            if( productAssetModel != null ) msgs = ( ( InternalEObject ) productAssetModel ).eInverseRemove( this,
                    CimPackage.PRODUCT_ASSET_MODEL__OPERATIONAL_RESTRICTIONS, ProductAssetModel.class, msgs );
            return basicSetProductAssetModel( ( ProductAssetModel ) otherEnd, msgs );
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
        case CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
            return basicUnsetActivePeriod( msgs );
        case CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE:
            return basicUnsetRestrictedValue( msgs );
        case CimPackage.OPERATIONAL_RESTRICTION__EQUIPMENTS:
            return ( ( InternalEList< ? > ) getEquipments() ).basicRemove( otherEnd, msgs );
        case CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL:
            return basicUnsetProductAssetModel( msgs );
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
        case CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
            return getActivePeriod();
        case CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE:
            return getRestrictedValue();
        case CimPackage.OPERATIONAL_RESTRICTION__EQUIPMENTS:
            return getEquipments();
        case CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL:
            return getProductAssetModel();
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
        case CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
            setActivePeriod( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE:
            setRestrictedValue( ( FloatQuantity ) newValue );
            return;
        case CimPackage.OPERATIONAL_RESTRICTION__EQUIPMENTS:
            getEquipments().clear();
            getEquipments().addAll( ( Collection< ? extends Equipment > ) newValue );
            return;
        case CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL:
            setProductAssetModel( ( ProductAssetModel ) newValue );
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
        case CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
            unsetActivePeriod();
            return;
        case CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE:
            unsetRestrictedValue();
            return;
        case CimPackage.OPERATIONAL_RESTRICTION__EQUIPMENTS:
            unsetEquipments();
            return;
        case CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL:
            unsetProductAssetModel();
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
        case CimPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
            return isSetActivePeriod();
        case CimPackage.OPERATIONAL_RESTRICTION__RESTRICTED_VALUE:
            return isSetRestrictedValue();
        case CimPackage.OPERATIONAL_RESTRICTION__EQUIPMENTS:
            return isSetEquipments();
        case CimPackage.OPERATIONAL_RESTRICTION__PRODUCT_ASSET_MODEL:
            return isSetProductAssetModel();
        }
        return super.eIsSet( featureID );
    }

} //OperationalRestrictionImpl
