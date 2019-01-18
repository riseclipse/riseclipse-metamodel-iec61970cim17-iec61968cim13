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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureImpl#getFumigantAppliedDate <em>Fumigant Applied Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureImpl#getFumigantName <em>Fumigant Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureImpl#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureImpl#getRemoveWeed <em>Remove Weed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureImpl#getWeedRemovedDate <em>Weed Removed Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureImpl#getStructureSupports <em>Structure Supports</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StructureImpl#getWireSpacingInfos <em>Wire Spacing Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureImpl extends AssetContainerImpl implements Structure {
    /**
     * The default value of the '{@link #getFumigantAppliedDate() <em>Fumigant Applied Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFumigantAppliedDate()
     * @generated
     * @ordered
     */
    protected static final Date FUMIGANT_APPLIED_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFumigantAppliedDate() <em>Fumigant Applied Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFumigantAppliedDate()
     * @generated
     * @ordered
     */
    protected Date fumigantAppliedDate = FUMIGANT_APPLIED_DATE_EDEFAULT;

    /**
     * This is true if the Fumigant Applied Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fumigantAppliedDateESet;

    /**
     * The default value of the '{@link #getFumigantName() <em>Fumigant Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFumigantName()
     * @generated
     * @ordered
     */
    protected static final String FUMIGANT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFumigantName() <em>Fumigant Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFumigantName()
     * @generated
     * @ordered
     */
    protected String fumigantName = FUMIGANT_NAME_EDEFAULT;

    /**
     * This is true if the Fumigant Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fumigantNameESet;

    /**
     * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeight()
     * @generated
     * @ordered
     */
    protected static final Float HEIGHT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeight()
     * @generated
     * @ordered
     */
    protected Float height = HEIGHT_EDEFAULT;

    /**
     * This is true if the Height attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean heightESet;

    /**
     * The default value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedVoltage()
     * @generated
     * @ordered
     */
    protected static final Float RATED_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedVoltage()
     * @generated
     * @ordered
     */
    protected Float ratedVoltage = RATED_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Rated Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedVoltageESet;

    /**
     * The default value of the '{@link #getRemoveWeed() <em>Remove Weed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoveWeed()
     * @generated
     * @ordered
     */
    protected static final Boolean REMOVE_WEED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemoveWeed() <em>Remove Weed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoveWeed()
     * @generated
     * @ordered
     */
    protected Boolean removeWeed = REMOVE_WEED_EDEFAULT;

    /**
     * This is true if the Remove Weed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean removeWeedESet;

    /**
     * The default value of the '{@link #getWeedRemovedDate() <em>Weed Removed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeedRemovedDate()
     * @generated
     * @ordered
     */
    protected static final Date WEED_REMOVED_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWeedRemovedDate() <em>Weed Removed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeedRemovedDate()
     * @generated
     * @ordered
     */
    protected Date weedRemovedDate = WEED_REMOVED_DATE_EDEFAULT;

    /**
     * This is true if the Weed Removed Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean weedRemovedDateESet;

    /**
     * The cached value of the '{@link #getStructureSupports() <em>Structure Supports</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStructureSupports()
     * @generated
     * @ordered
     */
    protected EList< StructureSupport > structureSupports;

    /**
     * The cached value of the '{@link #getWireSpacingInfos() <em>Wire Spacing Infos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWireSpacingInfos()
     * @generated
     * @ordered
     */
    protected EList< WireSpacing > wireSpacingInfos;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StructureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStructure();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getFumigantAppliedDate() {
        return fumigantAppliedDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFumigantAppliedDate( Date newFumigantAppliedDate ) {
        Date oldFumigantAppliedDate = fumigantAppliedDate;
        fumigantAppliedDate = newFumigantAppliedDate;
        boolean oldFumigantAppliedDateESet = fumigantAppliedDateESet;
        fumigantAppliedDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STRUCTURE__FUMIGANT_APPLIED_DATE,
                    oldFumigantAppliedDate, fumigantAppliedDate, !oldFumigantAppliedDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFumigantAppliedDate() {
        Date oldFumigantAppliedDate = fumigantAppliedDate;
        boolean oldFumigantAppliedDateESet = fumigantAppliedDateESet;
        fumigantAppliedDate = FUMIGANT_APPLIED_DATE_EDEFAULT;
        fumigantAppliedDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STRUCTURE__FUMIGANT_APPLIED_DATE,
                    oldFumigantAppliedDate, FUMIGANT_APPLIED_DATE_EDEFAULT, oldFumigantAppliedDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFumigantAppliedDate() {
        return fumigantAppliedDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFumigantName() {
        return fumigantName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFumigantName( String newFumigantName ) {
        String oldFumigantName = fumigantName;
        fumigantName = newFumigantName;
        boolean oldFumigantNameESet = fumigantNameESet;
        fumigantNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STRUCTURE__FUMIGANT_NAME, oldFumigantName, fumigantName, !oldFumigantNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFumigantName() {
        String oldFumigantName = fumigantName;
        boolean oldFumigantNameESet = fumigantNameESet;
        fumigantName = FUMIGANT_NAME_EDEFAULT;
        fumigantNameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STRUCTURE__FUMIGANT_NAME, oldFumigantName, FUMIGANT_NAME_EDEFAULT, oldFumigantNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFumigantName() {
        return fumigantNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHeight() {
        return height;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeight( Float newHeight ) {
        Float oldHeight = height;
        height = newHeight;
        boolean oldHeightESet = heightESet;
        heightESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STRUCTURE__HEIGHT, oldHeight, height, !oldHeightESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHeight() {
        Float oldHeight = height;
        boolean oldHeightESet = heightESet;
        height = HEIGHT_EDEFAULT;
        heightESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STRUCTURE__HEIGHT, oldHeight, HEIGHT_EDEFAULT, oldHeightESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHeight() {
        return heightESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedVoltage( Float newRatedVoltage ) {
        Float oldRatedVoltage = ratedVoltage;
        ratedVoltage = newRatedVoltage;
        boolean oldRatedVoltageESet = ratedVoltageESet;
        ratedVoltageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STRUCTURE__RATED_VOLTAGE, oldRatedVoltage, ratedVoltage, !oldRatedVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedVoltage() {
        Float oldRatedVoltage = ratedVoltage;
        boolean oldRatedVoltageESet = ratedVoltageESet;
        ratedVoltage = RATED_VOLTAGE_EDEFAULT;
        ratedVoltageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STRUCTURE__RATED_VOLTAGE, oldRatedVoltage, RATED_VOLTAGE_EDEFAULT, oldRatedVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedVoltage() {
        return ratedVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRemoveWeed() {
        return removeWeed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemoveWeed( Boolean newRemoveWeed ) {
        Boolean oldRemoveWeed = removeWeed;
        removeWeed = newRemoveWeed;
        boolean oldRemoveWeedESet = removeWeedESet;
        removeWeedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STRUCTURE__REMOVE_WEED, oldRemoveWeed, removeWeed, !oldRemoveWeedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemoveWeed() {
        Boolean oldRemoveWeed = removeWeed;
        boolean oldRemoveWeedESet = removeWeedESet;
        removeWeed = REMOVE_WEED_EDEFAULT;
        removeWeedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STRUCTURE__REMOVE_WEED, oldRemoveWeed, REMOVE_WEED_EDEFAULT, oldRemoveWeedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoveWeed() {
        return removeWeedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getWeedRemovedDate() {
        return weedRemovedDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWeedRemovedDate( Date newWeedRemovedDate ) {
        Date oldWeedRemovedDate = weedRemovedDate;
        weedRemovedDate = newWeedRemovedDate;
        boolean oldWeedRemovedDateESet = weedRemovedDateESet;
        weedRemovedDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STRUCTURE__WEED_REMOVED_DATE,
                    oldWeedRemovedDate, weedRemovedDate, !oldWeedRemovedDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWeedRemovedDate() {
        Date oldWeedRemovedDate = weedRemovedDate;
        boolean oldWeedRemovedDateESet = weedRemovedDateESet;
        weedRemovedDate = WEED_REMOVED_DATE_EDEFAULT;
        weedRemovedDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STRUCTURE__WEED_REMOVED_DATE,
                    oldWeedRemovedDate, WEED_REMOVED_DATE_EDEFAULT, oldWeedRemovedDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWeedRemovedDate() {
        return weedRemovedDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< StructureSupport > getStructureSupports() {
        if( structureSupports == null ) {
            structureSupports = new EObjectWithInverseResolvingEList.Unsettable< StructureSupport >(
                    StructureSupport.class, this, CimPackage.STRUCTURE__STRUCTURE_SUPPORTS,
                    CimPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE );
        }
        return structureSupports;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStructureSupports() {
        if( structureSupports != null ) ( ( InternalEList.Unsettable< ? > ) structureSupports ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStructureSupports() {
        return structureSupports != null && ( ( InternalEList.Unsettable< ? > ) structureSupports ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WireSpacing > getWireSpacingInfos() {
        if( wireSpacingInfos == null ) {
            wireSpacingInfos = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< WireSpacing >(
                    WireSpacing.class, this, CimPackage.STRUCTURE__WIRE_SPACING_INFOS,
                    CimPackage.WIRE_SPACING__STRUCTURES );
        }
        return wireSpacingInfos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWireSpacingInfos() {
        if( wireSpacingInfos != null ) ( ( InternalEList.Unsettable< ? > ) wireSpacingInfos ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWireSpacingInfos() {
        return wireSpacingInfos != null && ( ( InternalEList.Unsettable< ? > ) wireSpacingInfos ).isSet();
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
        case CimPackage.STRUCTURE__STRUCTURE_SUPPORTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getStructureSupports() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.STRUCTURE__WIRE_SPACING_INFOS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWireSpacingInfos() )
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
        case CimPackage.STRUCTURE__STRUCTURE_SUPPORTS:
            return ( ( InternalEList< ? > ) getStructureSupports() ).basicRemove( otherEnd, msgs );
        case CimPackage.STRUCTURE__WIRE_SPACING_INFOS:
            return ( ( InternalEList< ? > ) getWireSpacingInfos() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.STRUCTURE__FUMIGANT_APPLIED_DATE:
            return getFumigantAppliedDate();
        case CimPackage.STRUCTURE__FUMIGANT_NAME:
            return getFumigantName();
        case CimPackage.STRUCTURE__HEIGHT:
            return getHeight();
        case CimPackage.STRUCTURE__RATED_VOLTAGE:
            return getRatedVoltage();
        case CimPackage.STRUCTURE__REMOVE_WEED:
            return getRemoveWeed();
        case CimPackage.STRUCTURE__WEED_REMOVED_DATE:
            return getWeedRemovedDate();
        case CimPackage.STRUCTURE__STRUCTURE_SUPPORTS:
            return getStructureSupports();
        case CimPackage.STRUCTURE__WIRE_SPACING_INFOS:
            return getWireSpacingInfos();
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
        case CimPackage.STRUCTURE__FUMIGANT_APPLIED_DATE:
            setFumigantAppliedDate( ( Date ) newValue );
            return;
        case CimPackage.STRUCTURE__FUMIGANT_NAME:
            setFumigantName( ( String ) newValue );
            return;
        case CimPackage.STRUCTURE__HEIGHT:
            setHeight( ( Float ) newValue );
            return;
        case CimPackage.STRUCTURE__RATED_VOLTAGE:
            setRatedVoltage( ( Float ) newValue );
            return;
        case CimPackage.STRUCTURE__REMOVE_WEED:
            setRemoveWeed( ( Boolean ) newValue );
            return;
        case CimPackage.STRUCTURE__WEED_REMOVED_DATE:
            setWeedRemovedDate( ( Date ) newValue );
            return;
        case CimPackage.STRUCTURE__STRUCTURE_SUPPORTS:
            getStructureSupports().clear();
            getStructureSupports().addAll( ( Collection< ? extends StructureSupport > ) newValue );
            return;
        case CimPackage.STRUCTURE__WIRE_SPACING_INFOS:
            getWireSpacingInfos().clear();
            getWireSpacingInfos().addAll( ( Collection< ? extends WireSpacing > ) newValue );
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
        case CimPackage.STRUCTURE__FUMIGANT_APPLIED_DATE:
            unsetFumigantAppliedDate();
            return;
        case CimPackage.STRUCTURE__FUMIGANT_NAME:
            unsetFumigantName();
            return;
        case CimPackage.STRUCTURE__HEIGHT:
            unsetHeight();
            return;
        case CimPackage.STRUCTURE__RATED_VOLTAGE:
            unsetRatedVoltage();
            return;
        case CimPackage.STRUCTURE__REMOVE_WEED:
            unsetRemoveWeed();
            return;
        case CimPackage.STRUCTURE__WEED_REMOVED_DATE:
            unsetWeedRemovedDate();
            return;
        case CimPackage.STRUCTURE__STRUCTURE_SUPPORTS:
            unsetStructureSupports();
            return;
        case CimPackage.STRUCTURE__WIRE_SPACING_INFOS:
            unsetWireSpacingInfos();
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
        case CimPackage.STRUCTURE__FUMIGANT_APPLIED_DATE:
            return isSetFumigantAppliedDate();
        case CimPackage.STRUCTURE__FUMIGANT_NAME:
            return isSetFumigantName();
        case CimPackage.STRUCTURE__HEIGHT:
            return isSetHeight();
        case CimPackage.STRUCTURE__RATED_VOLTAGE:
            return isSetRatedVoltage();
        case CimPackage.STRUCTURE__REMOVE_WEED:
            return isSetRemoveWeed();
        case CimPackage.STRUCTURE__WEED_REMOVED_DATE:
            return isSetWeedRemovedDate();
        case CimPackage.STRUCTURE__STRUCTURE_SUPPORTS:
            return isSetStructureSupports();
        case CimPackage.STRUCTURE__WIRE_SPACING_INFOS:
            return isSetWireSpacingInfos();
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
        result.append( " (fumigantAppliedDate: " );
        if( fumigantAppliedDateESet )
            result.append( fumigantAppliedDate );
        else
            result.append( "<unset>" );
        result.append( ", fumigantName: " );
        if( fumigantNameESet )
            result.append( fumigantName );
        else
            result.append( "<unset>" );
        result.append( ", height: " );
        if( heightESet )
            result.append( height );
        else
            result.append( "<unset>" );
        result.append( ", ratedVoltage: " );
        if( ratedVoltageESet )
            result.append( ratedVoltage );
        else
            result.append( "<unset>" );
        result.append( ", removeWeed: " );
        if( removeWeedESet )
            result.append( removeWeed );
        else
            result.append( "<unset>" );
        result.append( ", weedRemovedDate: " );
        if( weedRemovedDateESet )
            result.append( weedRemovedDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StructureImpl
