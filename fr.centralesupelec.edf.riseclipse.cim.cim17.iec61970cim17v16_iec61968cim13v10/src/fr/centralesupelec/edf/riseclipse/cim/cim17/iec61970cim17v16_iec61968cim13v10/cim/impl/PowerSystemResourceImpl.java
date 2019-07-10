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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingShare;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalTag;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PSREvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PSRType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemResourceImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemResourceImpl#getAssetDatasheet <em>Asset Datasheet</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemResourceImpl#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemResourceImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemResourceImpl#getOperationalTags <em>Operational Tags</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemResourceImpl#getOperatingShare <em>Operating Share</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemResourceImpl#getClearances <em>Clearances</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemResourceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemResourceImpl#getPSRType <em>PSR Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemResourceImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerSystemResourceImpl#getPSREvents <em>PSR Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSystemResourceImpl extends IdentifiedObjectImpl implements PowerSystemResource {
    /**
     * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControls()
     * @generated
     * @ordered
     */
    protected EList< Control > controls;

    /**
     * The cached value of the '{@link #getAssetDatasheet() <em>Asset Datasheet</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetDatasheet()
     * @generated
     * @ordered
     */
    protected AssetInfo assetDatasheet;

    /**
     * This is true if the Asset Datasheet reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetDatasheetESet;

    /**
     * The cached value of the '{@link #getReportingGroup() <em>Reporting Group</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportingGroup()
     * @generated
     * @ordered
     */
    protected EList< ReportingGroup > reportingGroup;

    /**
     * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssets()
     * @generated
     * @ordered
     */
    protected EList< Asset > assets;

    /**
     * The cached value of the '{@link #getOperationalTags() <em>Operational Tags</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalTags()
     * @generated
     * @ordered
     */
    protected EList< OperationalTag > operationalTags;

    /**
     * The cached value of the '{@link #getOperatingShare() <em>Operating Share</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatingShare()
     * @generated
     * @ordered
     */
    protected EList< OperatingShare > operatingShare;

    /**
     * The cached value of the '{@link #getClearances() <em>Clearances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClearances()
     * @generated
     * @ordered
     */
    protected EList< ClearanceDocument > clearances;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected Location location;

    /**
     * This is true if the Location reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean locationESet;

    /**
     * The cached value of the '{@link #getPSRType() <em>PSR Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPSRType()
     * @generated
     * @ordered
     */
    protected PSRType psrType;

    /**
     * This is true if the PSR Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean psrTypeESet;

    /**
     * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurements()
     * @generated
     * @ordered
     */
    protected EList< Measurement > measurements;

    /**
     * The cached value of the '{@link #getPSREvents() <em>PSR Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPSREvents()
     * @generated
     * @ordered
     */
    protected EList< PSREvent > psrEvents;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerSystemResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerSystemResource();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Control > getControls() {
        if( controls == null ) {
            controls = new EObjectWithInverseResolvingEList.Unsettable< Control >( Control.class, this,
                    CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS, CimPackage.CONTROL__POWER_SYSTEM_RESOURCE );
        }
        return controls;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControls() {
        if( controls != null ) ( ( InternalEList.Unsettable< ? > ) controls ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControls() {
        return controls != null && ( ( InternalEList.Unsettable< ? > ) controls ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetInfo getAssetDatasheet() {
        return assetDatasheet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetDatasheet( AssetInfo newAssetDatasheet, NotificationChain msgs ) {
        AssetInfo oldAssetDatasheet = assetDatasheet;
        assetDatasheet = newAssetDatasheet;
        boolean oldAssetDatasheetESet = assetDatasheetESet;
        assetDatasheetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET, oldAssetDatasheet, newAssetDatasheet,
                    !oldAssetDatasheetESet );
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
    public void setAssetDatasheet( AssetInfo newAssetDatasheet ) {
        if( newAssetDatasheet != assetDatasheet ) {
            NotificationChain msgs = null;
            if( assetDatasheet != null ) msgs = ( ( InternalEObject ) assetDatasheet ).eInverseRemove( this,
                    CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES, AssetInfo.class, msgs );
            if( newAssetDatasheet != null ) msgs = ( ( InternalEObject ) newAssetDatasheet ).eInverseAdd( this,
                    CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES, AssetInfo.class, msgs );
            msgs = basicSetAssetDatasheet( newAssetDatasheet, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetDatasheetESet = assetDatasheetESet;
            assetDatasheetESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET,
                            newAssetDatasheet, newAssetDatasheet, !oldAssetDatasheetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetDatasheet( NotificationChain msgs ) {
        AssetInfo oldAssetDatasheet = assetDatasheet;
        assetDatasheet = null;
        boolean oldAssetDatasheetESet = assetDatasheetESet;
        assetDatasheetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET, oldAssetDatasheet, null, oldAssetDatasheetESet );
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
    public void unsetAssetDatasheet() {
        if( assetDatasheet != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetDatasheet ).eInverseRemove( this,
                    CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES, AssetInfo.class, msgs );
            msgs = basicUnsetAssetDatasheet( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetDatasheetESet = assetDatasheetESet;
            assetDatasheetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET, null, null, oldAssetDatasheetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetDatasheet() {
        return assetDatasheetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ReportingGroup > getReportingGroup() {
        if( reportingGroup == null ) {
            reportingGroup = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< ReportingGroup >(
                    ReportingGroup.class, this, CimPackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP,
                    CimPackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE );
        }
        return reportingGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReportingGroup() {
        if( reportingGroup != null ) ( ( InternalEList.Unsettable< ? > ) reportingGroup ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReportingGroup() {
        return reportingGroup != null && ( ( InternalEList.Unsettable< ? > ) reportingGroup ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Asset > getAssets() {
        if( assets == null ) {
            assets = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Asset >( Asset.class, this,
                    CimPackage.POWER_SYSTEM_RESOURCE__ASSETS, CimPackage.ASSET__POWER_SYSTEM_RESOURCES );
        }
        return assets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssets() {
        if( assets != null ) ( ( InternalEList.Unsettable< ? > ) assets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssets() {
        return assets != null && ( ( InternalEList.Unsettable< ? > ) assets ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationalTag > getOperationalTags() {
        if( operationalTags == null ) {
            operationalTags = new EObjectWithInverseResolvingEList.Unsettable< OperationalTag >( OperationalTag.class,
                    this, CimPackage.POWER_SYSTEM_RESOURCE__OPERATIONAL_TAGS,
                    CimPackage.OPERATIONAL_TAG__POWER_SYSTEM_RESOURCE );
        }
        return operationalTags;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalTags() {
        if( operationalTags != null ) ( ( InternalEList.Unsettable< ? > ) operationalTags ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalTags() {
        return operationalTags != null && ( ( InternalEList.Unsettable< ? > ) operationalTags ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperatingShare > getOperatingShare() {
        if( operatingShare == null ) {
            operatingShare = new EObjectWithInverseResolvingEList.Unsettable< OperatingShare >( OperatingShare.class,
                    this, CimPackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE,
                    CimPackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE );
        }
        return operatingShare;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperatingShare() {
        if( operatingShare != null ) ( ( InternalEList.Unsettable< ? > ) operatingShare ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperatingShare() {
        return operatingShare != null && ( ( InternalEList.Unsettable< ? > ) operatingShare ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ClearanceDocument > getClearances() {
        if( clearances == null ) {
            clearances = new EObjectWithInverseEList.Unsettable.ManyInverse< ClearanceDocument >(
                    ClearanceDocument.class, this, CimPackage.POWER_SYSTEM_RESOURCE__CLEARANCES,
                    CimPackage.CLEARANCE_DOCUMENT__TAGGED_PS_RS );
        }
        return clearances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetClearances() {
        if( clearances != null ) ( ( InternalEList.Unsettable< ? > ) clearances ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetClearances() {
        return clearances != null && ( ( InternalEList.Unsettable< ? > ) clearances ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Location getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocation( Location newLocation, NotificationChain msgs ) {
        Location oldLocation = location;
        location = newLocation;
        boolean oldLocationESet = locationESet;
        locationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_SYSTEM_RESOURCE__LOCATION, oldLocation, newLocation, !oldLocationESet );
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
    public void setLocation( Location newLocation ) {
        if( newLocation != location ) {
            NotificationChain msgs = null;
            if( location != null ) msgs = ( ( InternalEObject ) location ).eInverseRemove( this,
                    CimPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs );
            if( newLocation != null ) msgs = ( ( InternalEObject ) newLocation ).eInverseAdd( this,
                    CimPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs );
            msgs = basicSetLocation( newLocation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_SYSTEM_RESOURCE__LOCATION, newLocation, newLocation, !oldLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLocation( NotificationChain msgs ) {
        Location oldLocation = location;
        location = null;
        boolean oldLocationESet = locationESet;
        locationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_SYSTEM_RESOURCE__LOCATION, oldLocation, null, oldLocationESet );
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
    public void unsetLocation() {
        if( location != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) location ).eInverseRemove( this, CimPackage.LOCATION__POWER_SYSTEM_RESOURCES,
                    Location.class, msgs );
            msgs = basicUnsetLocation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_SYSTEM_RESOURCE__LOCATION, null, null, oldLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocation() {
        return locationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PSRType getPSRType() {
        return psrType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPSRType( PSRType newPSRType, NotificationChain msgs ) {
        PSRType oldPSRType = psrType;
        psrType = newPSRType;
        boolean oldPSRTypeESet = psrTypeESet;
        psrTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_SYSTEM_RESOURCE__PSR_TYPE, oldPSRType, newPSRType, !oldPSRTypeESet );
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
    public void setPSRType( PSRType newPSRType ) {
        if( newPSRType != psrType ) {
            NotificationChain msgs = null;
            if( psrType != null ) msgs = ( ( InternalEObject ) psrType ).eInverseRemove( this,
                    CimPackage.PSR_TYPE__POWER_SYSTEM_RESOURCES, PSRType.class, msgs );
            if( newPSRType != null ) msgs = ( ( InternalEObject ) newPSRType ).eInverseAdd( this,
                    CimPackage.PSR_TYPE__POWER_SYSTEM_RESOURCES, PSRType.class, msgs );
            msgs = basicSetPSRType( newPSRType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPSRTypeESet = psrTypeESet;
            psrTypeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_SYSTEM_RESOURCE__PSR_TYPE, newPSRType, newPSRType, !oldPSRTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPSRType( NotificationChain msgs ) {
        PSRType oldPSRType = psrType;
        psrType = null;
        boolean oldPSRTypeESet = psrTypeESet;
        psrTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_SYSTEM_RESOURCE__PSR_TYPE, oldPSRType, null, oldPSRTypeESet );
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
    public void unsetPSRType() {
        if( psrType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) psrType ).eInverseRemove( this, CimPackage.PSR_TYPE__POWER_SYSTEM_RESOURCES,
                    PSRType.class, msgs );
            msgs = basicUnsetPSRType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPSRTypeESet = psrTypeESet;
            psrTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_SYSTEM_RESOURCE__PSR_TYPE, null, null, oldPSRTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPSRType() {
        return psrTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Measurement > getMeasurements() {
        if( measurements == null ) {
            measurements = new EObjectWithInverseResolvingEList.Unsettable< Measurement >( Measurement.class, this,
                    CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE );
        }
        return measurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurements() {
        if( measurements != null ) ( ( InternalEList.Unsettable< ? > ) measurements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurements() {
        return measurements != null && ( ( InternalEList.Unsettable< ? > ) measurements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PSREvent > getPSREvents() {
        if( psrEvents == null ) {
            psrEvents = new EObjectWithInverseResolvingEList.Unsettable< PSREvent >( PSREvent.class, this,
                    CimPackage.POWER_SYSTEM_RESOURCE__PSR_EVENTS, CimPackage.PSR_EVENT__POWER_SYSTEM_RESOURCE );
        }
        return psrEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPSREvents() {
        if( psrEvents != null ) ( ( InternalEList.Unsettable< ? > ) psrEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPSREvents() {
        return psrEvents != null && ( ( InternalEList.Unsettable< ? > ) psrEvents ).isSet();
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
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getControls() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET:
            if( assetDatasheet != null ) msgs = ( ( InternalEObject ) assetDatasheet ).eInverseRemove( this,
                    CimPackage.ASSET_INFO__POWER_SYSTEM_RESOURCES, AssetInfo.class, msgs );
            return basicSetAssetDatasheet( ( AssetInfo ) otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReportingGroup() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssets() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATIONAL_TAGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperationalTags() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperatingShare() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__CLEARANCES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getClearances() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            if( location != null ) msgs = ( ( InternalEObject ) location ).eInverseRemove( this,
                    CimPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs );
            return basicSetLocation( ( Location ) otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
            if( psrType != null ) msgs = ( ( InternalEObject ) psrType ).eInverseRemove( this,
                    CimPackage.PSR_TYPE__POWER_SYSTEM_RESOURCES, PSRType.class, msgs );
            return basicSetPSRType( ( PSRType ) otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeasurements() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPSREvents() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            return ( ( InternalEList< ? > ) getControls() ).basicRemove( otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET:
            return basicUnsetAssetDatasheet( msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
            return ( ( InternalEList< ? > ) getReportingGroup() ).basicRemove( otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSETS:
            return ( ( InternalEList< ? > ) getAssets() ).basicRemove( otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATIONAL_TAGS:
            return ( ( InternalEList< ? > ) getOperationalTags() ).basicRemove( otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
            return ( ( InternalEList< ? > ) getOperatingShare() ).basicRemove( otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__CLEARANCES:
            return ( ( InternalEList< ? > ) getClearances() ).basicRemove( otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            return basicUnsetLocation( msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
            return basicUnsetPSRType( msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            return ( ( InternalEList< ? > ) getMeasurements() ).basicRemove( otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_EVENTS:
            return ( ( InternalEList< ? > ) getPSREvents() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            return getControls();
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET:
            return getAssetDatasheet();
        case CimPackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
            return getReportingGroup();
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSETS:
            return getAssets();
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATIONAL_TAGS:
            return getOperationalTags();
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
            return getOperatingShare();
        case CimPackage.POWER_SYSTEM_RESOURCE__CLEARANCES:
            return getClearances();
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            return getLocation();
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
            return getPSRType();
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            return getMeasurements();
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_EVENTS:
            return getPSREvents();
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
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            getControls().clear();
            getControls().addAll( ( Collection< ? extends Control > ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET:
            setAssetDatasheet( ( AssetInfo ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
            getReportingGroup().clear();
            getReportingGroup().addAll( ( Collection< ? extends ReportingGroup > ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSETS:
            getAssets().clear();
            getAssets().addAll( ( Collection< ? extends Asset > ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATIONAL_TAGS:
            getOperationalTags().clear();
            getOperationalTags().addAll( ( Collection< ? extends OperationalTag > ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
            getOperatingShare().clear();
            getOperatingShare().addAll( ( Collection< ? extends OperatingShare > ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__CLEARANCES:
            getClearances().clear();
            getClearances().addAll( ( Collection< ? extends ClearanceDocument > ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            setLocation( ( Location ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
            setPSRType( ( PSRType ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            getMeasurements().clear();
            getMeasurements().addAll( ( Collection< ? extends Measurement > ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_EVENTS:
            getPSREvents().clear();
            getPSREvents().addAll( ( Collection< ? extends PSREvent > ) newValue );
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
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            unsetControls();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET:
            unsetAssetDatasheet();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
            unsetReportingGroup();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSETS:
            unsetAssets();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATIONAL_TAGS:
            unsetOperationalTags();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
            unsetOperatingShare();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__CLEARANCES:
            unsetClearances();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            unsetLocation();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
            unsetPSRType();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            unsetMeasurements();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_EVENTS:
            unsetPSREvents();
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
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            return isSetControls();
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSET_DATASHEET:
            return isSetAssetDatasheet();
        case CimPackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
            return isSetReportingGroup();
        case CimPackage.POWER_SYSTEM_RESOURCE__ASSETS:
            return isSetAssets();
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATIONAL_TAGS:
            return isSetOperationalTags();
        case CimPackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
            return isSetOperatingShare();
        case CimPackage.POWER_SYSTEM_RESOURCE__CLEARANCES:
            return isSetClearances();
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            return isSetLocation();
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
            return isSetPSRType();
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            return isSetMeasurements();
        case CimPackage.POWER_SYSTEM_RESOURCE__PSR_EVENTS:
            return isSetPSREvents();
        }
        return super.eIsSet( featureID );
    }

} //PowerSystemResourceImpl
