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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetContainer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Seal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SealConditionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SealKind;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SealImpl#getAppliedDateTime <em>Applied Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SealImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SealImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SealImpl#getSealNumber <em>Seal Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SealImpl#getAssetContainer <em>Asset Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SealImpl extends IdentifiedObjectImpl implements Seal {
    /**
     * The default value of the '{@link #getAppliedDateTime() <em>Applied Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppliedDateTime()
     * @generated
     * @ordered
     */
    protected static final Date APPLIED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAppliedDateTime() <em>Applied Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppliedDateTime()
     * @generated
     * @ordered
     */
    protected Date appliedDateTime = APPLIED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Applied Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean appliedDateTimeESet;

    /**
     * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected static final SealConditionKind CONDITION_EDEFAULT = SealConditionKind.LOCKED;

    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected SealConditionKind condition = CONDITION_EDEFAULT;

    /**
     * This is true if the Condition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean conditionESet;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final SealKind KIND_EDEFAULT = SealKind.STEEL;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected SealKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getSealNumber() <em>Seal Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSealNumber()
     * @generated
     * @ordered
     */
    protected static final String SEAL_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSealNumber() <em>Seal Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSealNumber()
     * @generated
     * @ordered
     */
    protected String sealNumber = SEAL_NUMBER_EDEFAULT;

    /**
     * This is true if the Seal Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sealNumberESet;

    /**
     * The cached value of the '{@link #getAssetContainer() <em>Asset Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetContainer()
     * @generated
     * @ordered
     */
    protected AssetContainer assetContainer;

    /**
     * This is true if the Asset Container reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetContainerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SealImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSeal();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getAppliedDateTime() {
        return appliedDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAppliedDateTime( Date newAppliedDateTime ) {
        Date oldAppliedDateTime = appliedDateTime;
        appliedDateTime = newAppliedDateTime;
        boolean oldAppliedDateTimeESet = appliedDateTimeESet;
        appliedDateTimeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SEAL__APPLIED_DATE_TIME, oldAppliedDateTime, appliedDateTime, !oldAppliedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAppliedDateTime() {
        Date oldAppliedDateTime = appliedDateTime;
        boolean oldAppliedDateTimeESet = appliedDateTimeESet;
        appliedDateTime = APPLIED_DATE_TIME_EDEFAULT;
        appliedDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SEAL__APPLIED_DATE_TIME,
                    oldAppliedDateTime, APPLIED_DATE_TIME_EDEFAULT, oldAppliedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAppliedDateTime() {
        return appliedDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SealConditionKind getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCondition( SealConditionKind newCondition ) {
        SealConditionKind oldCondition = condition;
        condition = newCondition == null ? CONDITION_EDEFAULT : newCondition;
        boolean oldConditionESet = conditionESet;
        conditionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SEAL__CONDITION, oldCondition, condition, !oldConditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCondition() {
        SealConditionKind oldCondition = condition;
        boolean oldConditionESet = conditionESet;
        condition = CONDITION_EDEFAULT;
        conditionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SEAL__CONDITION, oldCondition, CONDITION_EDEFAULT, oldConditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCondition() {
        return conditionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SealKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( SealKind newKind ) {
        SealKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SEAL__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        SealKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SEAL__KIND,
                oldKind, KIND_EDEFAULT, oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSealNumber() {
        return sealNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSealNumber( String newSealNumber ) {
        String oldSealNumber = sealNumber;
        sealNumber = newSealNumber;
        boolean oldSealNumberESet = sealNumberESet;
        sealNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SEAL__SEAL_NUMBER, oldSealNumber, sealNumber, !oldSealNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSealNumber() {
        String oldSealNumber = sealNumber;
        boolean oldSealNumberESet = sealNumberESet;
        sealNumber = SEAL_NUMBER_EDEFAULT;
        sealNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SEAL__SEAL_NUMBER, oldSealNumber, SEAL_NUMBER_EDEFAULT, oldSealNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSealNumber() {
        return sealNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetContainer getAssetContainer() {
        return assetContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetContainer( AssetContainer newAssetContainer, NotificationChain msgs ) {
        AssetContainer oldAssetContainer = assetContainer;
        assetContainer = newAssetContainer;
        boolean oldAssetContainerESet = assetContainerESet;
        assetContainerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SEAL__ASSET_CONTAINER, oldAssetContainer, newAssetContainer, !oldAssetContainerESet );
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
    public void setAssetContainer( AssetContainer newAssetContainer ) {
        if( newAssetContainer != assetContainer ) {
            NotificationChain msgs = null;
            if( assetContainer != null ) msgs = ( ( InternalEObject ) assetContainer ).eInverseRemove( this,
                    CimPackage.ASSET_CONTAINER__SEALS, AssetContainer.class, msgs );
            if( newAssetContainer != null ) msgs = ( ( InternalEObject ) newAssetContainer ).eInverseAdd( this,
                    CimPackage.ASSET_CONTAINER__SEALS, AssetContainer.class, msgs );
            msgs = basicSetAssetContainer( newAssetContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetContainerESet = assetContainerESet;
            assetContainerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SEAL__ASSET_CONTAINER, newAssetContainer, newAssetContainer, !oldAssetContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetContainer( NotificationChain msgs ) {
        AssetContainer oldAssetContainer = assetContainer;
        assetContainer = null;
        boolean oldAssetContainerESet = assetContainerESet;
        assetContainerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SEAL__ASSET_CONTAINER, oldAssetContainer, null, oldAssetContainerESet );
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
    public void unsetAssetContainer() {
        if( assetContainer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetContainer ).eInverseRemove( this, CimPackage.ASSET_CONTAINER__SEALS,
                    AssetContainer.class, msgs );
            msgs = basicUnsetAssetContainer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetContainerESet = assetContainerESet;
            assetContainerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SEAL__ASSET_CONTAINER, null, null, oldAssetContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetContainer() {
        return assetContainerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SEAL__ASSET_CONTAINER:
            if( assetContainer != null ) msgs = ( ( InternalEObject ) assetContainer ).eInverseRemove( this,
                    CimPackage.ASSET_CONTAINER__SEALS, AssetContainer.class, msgs );
            return basicSetAssetContainer( ( AssetContainer ) otherEnd, msgs );
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
        case CimPackage.SEAL__ASSET_CONTAINER:
            return basicUnsetAssetContainer( msgs );
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
        case CimPackage.SEAL__APPLIED_DATE_TIME:
            return getAppliedDateTime();
        case CimPackage.SEAL__CONDITION:
            return getCondition();
        case CimPackage.SEAL__KIND:
            return getKind();
        case CimPackage.SEAL__SEAL_NUMBER:
            return getSealNumber();
        case CimPackage.SEAL__ASSET_CONTAINER:
            return getAssetContainer();
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
        case CimPackage.SEAL__APPLIED_DATE_TIME:
            setAppliedDateTime( ( Date ) newValue );
            return;
        case CimPackage.SEAL__CONDITION:
            setCondition( ( SealConditionKind ) newValue );
            return;
        case CimPackage.SEAL__KIND:
            setKind( ( SealKind ) newValue );
            return;
        case CimPackage.SEAL__SEAL_NUMBER:
            setSealNumber( ( String ) newValue );
            return;
        case CimPackage.SEAL__ASSET_CONTAINER:
            setAssetContainer( ( AssetContainer ) newValue );
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
        case CimPackage.SEAL__APPLIED_DATE_TIME:
            unsetAppliedDateTime();
            return;
        case CimPackage.SEAL__CONDITION:
            unsetCondition();
            return;
        case CimPackage.SEAL__KIND:
            unsetKind();
            return;
        case CimPackage.SEAL__SEAL_NUMBER:
            unsetSealNumber();
            return;
        case CimPackage.SEAL__ASSET_CONTAINER:
            unsetAssetContainer();
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
        case CimPackage.SEAL__APPLIED_DATE_TIME:
            return isSetAppliedDateTime();
        case CimPackage.SEAL__CONDITION:
            return isSetCondition();
        case CimPackage.SEAL__KIND:
            return isSetKind();
        case CimPackage.SEAL__SEAL_NUMBER:
            return isSetSealNumber();
        case CimPackage.SEAL__ASSET_CONTAINER:
            return isSetAssetContainer();
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
        result.append( " (appliedDateTime: " );
        if( appliedDateTimeESet )
            result.append( appliedDateTime );
        else
            result.append( "<unset>" );
        result.append( ", condition: " );
        if( conditionESet )
            result.append( condition );
        else
            result.append( "<unset>" );
        result.append( ", kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ", sealNumber: " );
        if( sealNumberESet )
            result.append( sealNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SealImpl
