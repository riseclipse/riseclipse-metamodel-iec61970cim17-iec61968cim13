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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetLocationHazard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoordinateSystem;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ElectronicAddress;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PositionPoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Status;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber;

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
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getGeoInfoReference <em>Geo Info Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getMainAddress <em>Main Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getPhone1 <em>Phone1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getPhone2 <em>Phone2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getSecondaryAddress <em>Secondary Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getIncident <em>Incident</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getHazards <em>Hazards</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getPositionPoints <em>Position Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LocationImpl#getConfigurationEvents <em>Configuration Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends IdentifiedObjectImpl implements Location {
    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final String DIRECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected String direction = DIRECTION_EDEFAULT;

    /**
     * This is true if the Direction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean directionESet;

    /**
     * The default value of the '{@link #getGeoInfoReference() <em>Geo Info Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeoInfoReference()
     * @generated
     * @ordered
     */
    protected static final String GEO_INFO_REFERENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGeoInfoReference() <em>Geo Info Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeoInfoReference()
     * @generated
     * @ordered
     */
    protected String geoInfoReference = GEO_INFO_REFERENCE_EDEFAULT;

    /**
     * This is true if the Geo Info Reference attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean geoInfoReferenceESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElectronicAddress()
     * @generated
     * @ordered
     */
    protected ElectronicAddress electronicAddress;

    /**
     * This is true if the Electronic Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean electronicAddressESet;

    /**
     * The cached value of the '{@link #getMainAddress() <em>Main Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMainAddress()
     * @generated
     * @ordered
     */
    protected StreetAddress mainAddress;

    /**
     * This is true if the Main Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mainAddressESet;

    /**
     * The cached value of the '{@link #getPhone1() <em>Phone1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhone1()
     * @generated
     * @ordered
     */
    protected TelephoneNumber phone1;

    /**
     * This is true if the Phone1 containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phone1ESet;

    /**
     * The cached value of the '{@link #getPhone2() <em>Phone2</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhone2()
     * @generated
     * @ordered
     */
    protected TelephoneNumber phone2;

    /**
     * This is true if the Phone2 containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phone2ESet;

    /**
     * The cached value of the '{@link #getSecondaryAddress() <em>Secondary Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecondaryAddress()
     * @generated
     * @ordered
     */
    protected StreetAddress secondaryAddress;

    /**
     * This is true if the Secondary Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean secondaryAddressESet;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected Status status;

    /**
     * This is true if the Status containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusESet;

    /**
     * The cached value of the '{@link #getIncident() <em>Incident</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncident()
     * @generated
     * @ordered
     */
    protected Incident incident;

    /**
     * This is true if the Incident reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean incidentESet;

    /**
     * The cached value of the '{@link #getHazards() <em>Hazards</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHazards()
     * @generated
     * @ordered
     */
    protected EList< AssetLocationHazard > hazards;

    /**
     * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResources()
     * @generated
     * @ordered
     */
    protected EList< PowerSystemResource > powerSystemResources;

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
     * The cached value of the '{@link #getCoordinateSystem() <em>Coordinate System</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoordinateSystem()
     * @generated
     * @ordered
     */
    protected CoordinateSystem coordinateSystem;

    /**
     * This is true if the Coordinate System reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coordinateSystemESet;

    /**
     * The cached value of the '{@link #getPositionPoints() <em>Position Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositionPoints()
     * @generated
     * @ordered
     */
    protected EList< PositionPoint > positionPoints;

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
     * The cached value of the '{@link #getConfigurationEvents() <em>Configuration Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurationEvents()
     * @generated
     * @ordered
     */
    protected EList< ConfigurationEvent > configurationEvents;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LocationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLocation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDirection() {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDirection( String newDirection ) {
        String oldDirection = direction;
        direction = newDirection;
        boolean oldDirectionESet = directionESet;
        directionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOCATION__DIRECTION, oldDirection, direction, !oldDirectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDirection() {
        String oldDirection = direction;
        boolean oldDirectionESet = directionESet;
        direction = DIRECTION_EDEFAULT;
        directionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOCATION__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDirection() {
        return directionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getGeoInfoReference() {
        return geoInfoReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGeoInfoReference( String newGeoInfoReference ) {
        String oldGeoInfoReference = geoInfoReference;
        geoInfoReference = newGeoInfoReference;
        boolean oldGeoInfoReferenceESet = geoInfoReferenceESet;
        geoInfoReferenceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOCATION__GEO_INFO_REFERENCE,
                    oldGeoInfoReference, geoInfoReference, !oldGeoInfoReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGeoInfoReference() {
        String oldGeoInfoReference = geoInfoReference;
        boolean oldGeoInfoReferenceESet = geoInfoReferenceESet;
        geoInfoReference = GEO_INFO_REFERENCE_EDEFAULT;
        geoInfoReferenceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOCATION__GEO_INFO_REFERENCE,
                    oldGeoInfoReference, GEO_INFO_REFERENCE_EDEFAULT, oldGeoInfoReferenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGeoInfoReference() {
        return geoInfoReferenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOCATION__TYPE,
                oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOCATION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElectronicAddress getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElectronicAddress( ElectronicAddress newElectronicAddress,
            NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = newElectronicAddress;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__ELECTRONIC_ADDRESS, oldElectronicAddress, newElectronicAddress,
                    !oldElectronicAddressESet );
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
    public void setElectronicAddress( ElectronicAddress newElectronicAddress ) {
        if( newElectronicAddress != electronicAddress ) {
            NotificationChain msgs = null;
            if( electronicAddress != null ) msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__ELECTRONIC_ADDRESS, null, msgs );
            if( newElectronicAddress != null ) msgs = ( ( InternalEObject ) newElectronicAddress ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicSetElectronicAddress( newElectronicAddress, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOCATION__ELECTRONIC_ADDRESS,
                        newElectronicAddress, newElectronicAddress, !oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetElectronicAddress( NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = null;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__ELECTRONIC_ADDRESS, oldElectronicAddress, null, oldElectronicAddressESet );
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
    public void unsetElectronicAddress() {
        if( electronicAddress != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicUnsetElectronicAddress( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__ELECTRONIC_ADDRESS, null, null, oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetElectronicAddress() {
        return electronicAddressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StreetAddress getMainAddress() {
        return mainAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMainAddress( StreetAddress newMainAddress, NotificationChain msgs ) {
        StreetAddress oldMainAddress = mainAddress;
        mainAddress = newMainAddress;
        boolean oldMainAddressESet = mainAddressESet;
        mainAddressESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__MAIN_ADDRESS, oldMainAddress, newMainAddress, !oldMainAddressESet );
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
    public void setMainAddress( StreetAddress newMainAddress ) {
        if( newMainAddress != mainAddress ) {
            NotificationChain msgs = null;
            if( mainAddress != null ) msgs = ( ( InternalEObject ) mainAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__MAIN_ADDRESS, null, msgs );
            if( newMainAddress != null ) msgs = ( ( InternalEObject ) newMainAddress ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__MAIN_ADDRESS, null, msgs );
            msgs = basicSetMainAddress( newMainAddress, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMainAddressESet = mainAddressESet;
            mainAddressESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__MAIN_ADDRESS, newMainAddress, newMainAddress, !oldMainAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMainAddress( NotificationChain msgs ) {
        StreetAddress oldMainAddress = mainAddress;
        mainAddress = null;
        boolean oldMainAddressESet = mainAddressESet;
        mainAddressESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__MAIN_ADDRESS, oldMainAddress, null, oldMainAddressESet );
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
    public void unsetMainAddress() {
        if( mainAddress != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) mainAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__MAIN_ADDRESS, null, msgs );
            msgs = basicUnsetMainAddress( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMainAddressESet = mainAddressESet;
            mainAddressESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__MAIN_ADDRESS, null, null, oldMainAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMainAddress() {
        return mainAddressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TelephoneNumber getPhone1() {
        return phone1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPhone1( TelephoneNumber newPhone1, NotificationChain msgs ) {
        TelephoneNumber oldPhone1 = phone1;
        phone1 = newPhone1;
        boolean oldPhone1ESet = phone1ESet;
        phone1ESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.LOCATION__PHONE1,
                    oldPhone1, newPhone1, !oldPhone1ESet );
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
    public void setPhone1( TelephoneNumber newPhone1 ) {
        if( newPhone1 != phone1 ) {
            NotificationChain msgs = null;
            if( phone1 != null ) msgs = ( ( InternalEObject ) phone1 ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__PHONE1, null, msgs );
            if( newPhone1 != null ) msgs = ( ( InternalEObject ) newPhone1 ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__PHONE1, null, msgs );
            msgs = basicSetPhone1( newPhone1, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhone1ESet = phone1ESet;
            phone1ESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__PHONE1, newPhone1, newPhone1, !oldPhone1ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPhone1( NotificationChain msgs ) {
        TelephoneNumber oldPhone1 = phone1;
        phone1 = null;
        boolean oldPhone1ESet = phone1ESet;
        phone1ESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__PHONE1, oldPhone1, null, oldPhone1ESet );
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
    public void unsetPhone1() {
        if( phone1 != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) phone1 ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__PHONE1, null, msgs );
            msgs = basicUnsetPhone1( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhone1ESet = phone1ESet;
            phone1ESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__PHONE1, null, null, oldPhone1ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhone1() {
        return phone1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TelephoneNumber getPhone2() {
        return phone2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPhone2( TelephoneNumber newPhone2, NotificationChain msgs ) {
        TelephoneNumber oldPhone2 = phone2;
        phone2 = newPhone2;
        boolean oldPhone2ESet = phone2ESet;
        phone2ESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.LOCATION__PHONE2,
                    oldPhone2, newPhone2, !oldPhone2ESet );
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
    public void setPhone2( TelephoneNumber newPhone2 ) {
        if( newPhone2 != phone2 ) {
            NotificationChain msgs = null;
            if( phone2 != null ) msgs = ( ( InternalEObject ) phone2 ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__PHONE2, null, msgs );
            if( newPhone2 != null ) msgs = ( ( InternalEObject ) newPhone2 ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__PHONE2, null, msgs );
            msgs = basicSetPhone2( newPhone2, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhone2ESet = phone2ESet;
            phone2ESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__PHONE2, newPhone2, newPhone2, !oldPhone2ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPhone2( NotificationChain msgs ) {
        TelephoneNumber oldPhone2 = phone2;
        phone2 = null;
        boolean oldPhone2ESet = phone2ESet;
        phone2ESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__PHONE2, oldPhone2, null, oldPhone2ESet );
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
    public void unsetPhone2() {
        if( phone2 != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) phone2 ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__PHONE2, null, msgs );
            msgs = basicUnsetPhone2( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhone2ESet = phone2ESet;
            phone2ESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__PHONE2, null, null, oldPhone2ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhone2() {
        return phone2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StreetAddress getSecondaryAddress() {
        return secondaryAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSecondaryAddress( StreetAddress newSecondaryAddress, NotificationChain msgs ) {
        StreetAddress oldSecondaryAddress = secondaryAddress;
        secondaryAddress = newSecondaryAddress;
        boolean oldSecondaryAddressESet = secondaryAddressESet;
        secondaryAddressESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__SECONDARY_ADDRESS, oldSecondaryAddress, newSecondaryAddress,
                    !oldSecondaryAddressESet );
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
    public void setSecondaryAddress( StreetAddress newSecondaryAddress ) {
        if( newSecondaryAddress != secondaryAddress ) {
            NotificationChain msgs = null;
            if( secondaryAddress != null ) msgs = ( ( InternalEObject ) secondaryAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__SECONDARY_ADDRESS, null, msgs );
            if( newSecondaryAddress != null ) msgs = ( ( InternalEObject ) newSecondaryAddress ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__SECONDARY_ADDRESS, null, msgs );
            msgs = basicSetSecondaryAddress( newSecondaryAddress, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSecondaryAddressESet = secondaryAddressESet;
            secondaryAddressESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOCATION__SECONDARY_ADDRESS,
                        newSecondaryAddress, newSecondaryAddress, !oldSecondaryAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSecondaryAddress( NotificationChain msgs ) {
        StreetAddress oldSecondaryAddress = secondaryAddress;
        secondaryAddress = null;
        boolean oldSecondaryAddressESet = secondaryAddressESet;
        secondaryAddressESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__SECONDARY_ADDRESS, oldSecondaryAddress, null, oldSecondaryAddressESet );
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
    public void unsetSecondaryAddress() {
        if( secondaryAddress != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) secondaryAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__SECONDARY_ADDRESS, null, msgs );
            msgs = basicUnsetSecondaryAddress( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSecondaryAddressESet = secondaryAddressESet;
            secondaryAddressESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__SECONDARY_ADDRESS, null, null, oldSecondaryAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecondaryAddress() {
        return secondaryAddressESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Status getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatus( Status newStatus, NotificationChain msgs ) {
        Status oldStatus = status;
        status = newStatus;
        boolean oldStatusESet = statusESet;
        statusESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.LOCATION__STATUS,
                    oldStatus, newStatus, !oldStatusESet );
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
    public void setStatus( Status newStatus ) {
        if( newStatus != status ) {
            NotificationChain msgs = null;
            if( status != null ) msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__STATUS, null, msgs );
            if( newStatus != null ) msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__STATUS, newStatus, newStatus, !oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStatus( NotificationChain msgs ) {
        Status oldStatus = status;
        status = null;
        boolean oldStatusESet = statusESet;
        statusESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__STATUS, oldStatus, null, oldStatusESet );
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
    public void unsetStatus() {
        if( status != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.LOCATION__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__STATUS, null, null, oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatus() {
        return statusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Incident getIncident() {
        if( incident != null && incident.eIsProxy() ) {
            InternalEObject oldIncident = ( InternalEObject ) incident;
            incident = ( Incident ) eResolveProxy( oldIncident );
            if( incident != oldIncident ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.LOCATION__INCIDENT, oldIncident, incident ) );
            }
        }
        return incident;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Incident basicGetIncident() {
        return incident;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIncident( Incident newIncident, NotificationChain msgs ) {
        Incident oldIncident = incident;
        incident = newIncident;
        boolean oldIncidentESet = incidentESet;
        incidentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__INCIDENT, oldIncident, newIncident, !oldIncidentESet );
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
    public void setIncident( Incident newIncident ) {
        if( newIncident != incident ) {
            NotificationChain msgs = null;
            if( incident != null ) msgs = ( ( InternalEObject ) incident ).eInverseRemove( this,
                    CimPackage.INCIDENT__LOCATION, Incident.class, msgs );
            if( newIncident != null ) msgs = ( ( InternalEObject ) newIncident ).eInverseAdd( this,
                    CimPackage.INCIDENT__LOCATION, Incident.class, msgs );
            msgs = basicSetIncident( newIncident, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncidentESet = incidentESet;
            incidentESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__INCIDENT, newIncident, newIncident, !oldIncidentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIncident( NotificationChain msgs ) {
        Incident oldIncident = incident;
        incident = null;
        boolean oldIncidentESet = incidentESet;
        incidentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__INCIDENT, oldIncident, null, oldIncidentESet );
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
    public void unsetIncident() {
        if( incident != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) incident ).eInverseRemove( this, CimPackage.INCIDENT__LOCATION, Incident.class,
                    msgs );
            msgs = basicUnsetIncident( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncidentESet = incidentESet;
            incidentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__INCIDENT, null, null, oldIncidentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIncident() {
        return incidentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AssetLocationHazard > getHazards() {
        if( hazards == null ) {
            hazards = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< AssetLocationHazard >(
                    AssetLocationHazard.class, this, CimPackage.LOCATION__HAZARDS,
                    CimPackage.ASSET_LOCATION_HAZARD__LOCATIONS );
        }
        return hazards;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHazards() {
        if( hazards != null ) ( ( InternalEList.Unsettable< ? > ) hazards ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHazards() {
        return hazards != null && ( ( InternalEList.Unsettable< ? > ) hazards ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerSystemResource > getPowerSystemResources() {
        if( powerSystemResources == null ) {
            powerSystemResources = new EObjectWithInverseResolvingEList.Unsettable< PowerSystemResource >(
                    PowerSystemResource.class, this, CimPackage.LOCATION__POWER_SYSTEM_RESOURCES,
                    CimPackage.POWER_SYSTEM_RESOURCE__LOCATION );
        }
        return powerSystemResources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerSystemResources() {
        if( powerSystemResources != null ) ( ( InternalEList.Unsettable< ? > ) powerSystemResources ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResources() {
        return powerSystemResources != null && ( ( InternalEList.Unsettable< ? > ) powerSystemResources ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Asset > getAssets() {
        if( assets == null ) {
            assets = new EObjectWithInverseResolvingEList.Unsettable< Asset >( Asset.class, this,
                    CimPackage.LOCATION__ASSETS, CimPackage.ASSET__LOCATION );
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
    public CoordinateSystem getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCoordinateSystem( CoordinateSystem newCoordinateSystem, NotificationChain msgs ) {
        CoordinateSystem oldCoordinateSystem = coordinateSystem;
        coordinateSystem = newCoordinateSystem;
        boolean oldCoordinateSystemESet = coordinateSystemESet;
        coordinateSystemESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__COORDINATE_SYSTEM, oldCoordinateSystem, newCoordinateSystem,
                    !oldCoordinateSystemESet );
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
    public void setCoordinateSystem( CoordinateSystem newCoordinateSystem ) {
        if( newCoordinateSystem != coordinateSystem ) {
            NotificationChain msgs = null;
            if( coordinateSystem != null ) msgs = ( ( InternalEObject ) coordinateSystem ).eInverseRemove( this,
                    CimPackage.COORDINATE_SYSTEM__LOCATIONS, CoordinateSystem.class, msgs );
            if( newCoordinateSystem != null ) msgs = ( ( InternalEObject ) newCoordinateSystem ).eInverseAdd( this,
                    CimPackage.COORDINATE_SYSTEM__LOCATIONS, CoordinateSystem.class, msgs );
            msgs = basicSetCoordinateSystem( newCoordinateSystem, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCoordinateSystemESet = coordinateSystemESet;
            coordinateSystemESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOCATION__COORDINATE_SYSTEM,
                        newCoordinateSystem, newCoordinateSystem, !oldCoordinateSystemESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCoordinateSystem( NotificationChain msgs ) {
        CoordinateSystem oldCoordinateSystem = coordinateSystem;
        coordinateSystem = null;
        boolean oldCoordinateSystemESet = coordinateSystemESet;
        coordinateSystemESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__COORDINATE_SYSTEM, oldCoordinateSystem, null, oldCoordinateSystemESet );
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
    public void unsetCoordinateSystem() {
        if( coordinateSystem != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) coordinateSystem ).eInverseRemove( this,
                    CimPackage.COORDINATE_SYSTEM__LOCATIONS, CoordinateSystem.class, msgs );
            msgs = basicUnsetCoordinateSystem( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCoordinateSystemESet = coordinateSystemESet;
            coordinateSystemESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__COORDINATE_SYSTEM, null, null, oldCoordinateSystemESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoordinateSystem() {
        return coordinateSystemESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PositionPoint > getPositionPoints() {
        if( positionPoints == null ) {
            positionPoints = new EObjectWithInverseResolvingEList.Unsettable< PositionPoint >( PositionPoint.class,
                    this, CimPackage.LOCATION__POSITION_POINTS, CimPackage.POSITION_POINT__LOCATION );
        }
        return positionPoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPositionPoints() {
        if( positionPoints != null ) ( ( InternalEList.Unsettable< ? > ) positionPoints ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPositionPoints() {
        return positionPoints != null && ( ( InternalEList.Unsettable< ? > ) positionPoints ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Measurement > getMeasurements() {
        if( measurements == null ) {
            measurements = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Measurement >(
                    Measurement.class, this, CimPackage.LOCATION__MEASUREMENTS, CimPackage.MEASUREMENT__LOCATIONS );
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
    public EList< ConfigurationEvent > getConfigurationEvents() {
        if( configurationEvents == null ) {
            configurationEvents = new EObjectWithInverseResolvingEList.Unsettable< ConfigurationEvent >(
                    ConfigurationEvent.class, this, CimPackage.LOCATION__CONFIGURATION_EVENTS,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_LOCATION );
        }
        return configurationEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfigurationEvents() {
        if( configurationEvents != null ) ( ( InternalEList.Unsettable< ? > ) configurationEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfigurationEvents() {
        return configurationEvents != null && ( ( InternalEList.Unsettable< ? > ) configurationEvents ).isSet();
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
        case CimPackage.LOCATION__INCIDENT:
            if( incident != null ) msgs = ( ( InternalEObject ) incident ).eInverseRemove( this,
                    CimPackage.INCIDENT__LOCATION, Incident.class, msgs );
            return basicSetIncident( ( Incident ) otherEnd, msgs );
        case CimPackage.LOCATION__HAZARDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getHazards() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerSystemResources() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.LOCATION__ASSETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssets() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            if( coordinateSystem != null ) msgs = ( ( InternalEObject ) coordinateSystem ).eInverseRemove( this,
                    CimPackage.COORDINATE_SYSTEM__LOCATIONS, CoordinateSystem.class, msgs );
            return basicSetCoordinateSystem( ( CoordinateSystem ) otherEnd, msgs );
        case CimPackage.LOCATION__POSITION_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPositionPoints() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.LOCATION__MEASUREMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeasurements() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.LOCATION__CONFIGURATION_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConfigurationEvents() )
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
        case CimPackage.LOCATION__ELECTRONIC_ADDRESS:
            return basicUnsetElectronicAddress( msgs );
        case CimPackage.LOCATION__MAIN_ADDRESS:
            return basicUnsetMainAddress( msgs );
        case CimPackage.LOCATION__PHONE1:
            return basicUnsetPhone1( msgs );
        case CimPackage.LOCATION__PHONE2:
            return basicUnsetPhone2( msgs );
        case CimPackage.LOCATION__SECONDARY_ADDRESS:
            return basicUnsetSecondaryAddress( msgs );
        case CimPackage.LOCATION__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.LOCATION__INCIDENT:
            return basicUnsetIncident( msgs );
        case CimPackage.LOCATION__HAZARDS:
            return ( ( InternalEList< ? > ) getHazards() ).basicRemove( otherEnd, msgs );
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            return ( ( InternalEList< ? > ) getPowerSystemResources() ).basicRemove( otherEnd, msgs );
        case CimPackage.LOCATION__ASSETS:
            return ( ( InternalEList< ? > ) getAssets() ).basicRemove( otherEnd, msgs );
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            return basicUnsetCoordinateSystem( msgs );
        case CimPackage.LOCATION__POSITION_POINTS:
            return ( ( InternalEList< ? > ) getPositionPoints() ).basicRemove( otherEnd, msgs );
        case CimPackage.LOCATION__MEASUREMENTS:
            return ( ( InternalEList< ? > ) getMeasurements() ).basicRemove( otherEnd, msgs );
        case CimPackage.LOCATION__CONFIGURATION_EVENTS:
            return ( ( InternalEList< ? > ) getConfigurationEvents() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.LOCATION__DIRECTION:
            return getDirection();
        case CimPackage.LOCATION__GEO_INFO_REFERENCE:
            return getGeoInfoReference();
        case CimPackage.LOCATION__TYPE:
            return getType();
        case CimPackage.LOCATION__ELECTRONIC_ADDRESS:
            return getElectronicAddress();
        case CimPackage.LOCATION__MAIN_ADDRESS:
            return getMainAddress();
        case CimPackage.LOCATION__PHONE1:
            return getPhone1();
        case CimPackage.LOCATION__PHONE2:
            return getPhone2();
        case CimPackage.LOCATION__SECONDARY_ADDRESS:
            return getSecondaryAddress();
        case CimPackage.LOCATION__STATUS:
            return getStatus();
        case CimPackage.LOCATION__INCIDENT:
            if( resolve ) return getIncident();
            return basicGetIncident();
        case CimPackage.LOCATION__HAZARDS:
            return getHazards();
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            return getPowerSystemResources();
        case CimPackage.LOCATION__ASSETS:
            return getAssets();
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            return getCoordinateSystem();
        case CimPackage.LOCATION__POSITION_POINTS:
            return getPositionPoints();
        case CimPackage.LOCATION__MEASUREMENTS:
            return getMeasurements();
        case CimPackage.LOCATION__CONFIGURATION_EVENTS:
            return getConfigurationEvents();
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
        case CimPackage.LOCATION__DIRECTION:
            setDirection( ( String ) newValue );
            return;
        case CimPackage.LOCATION__GEO_INFO_REFERENCE:
            setGeoInfoReference( ( String ) newValue );
            return;
        case CimPackage.LOCATION__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.LOCATION__ELECTRONIC_ADDRESS:
            setElectronicAddress( ( ElectronicAddress ) newValue );
            return;
        case CimPackage.LOCATION__MAIN_ADDRESS:
            setMainAddress( ( StreetAddress ) newValue );
            return;
        case CimPackage.LOCATION__PHONE1:
            setPhone1( ( TelephoneNumber ) newValue );
            return;
        case CimPackage.LOCATION__PHONE2:
            setPhone2( ( TelephoneNumber ) newValue );
            return;
        case CimPackage.LOCATION__SECONDARY_ADDRESS:
            setSecondaryAddress( ( StreetAddress ) newValue );
            return;
        case CimPackage.LOCATION__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.LOCATION__INCIDENT:
            setIncident( ( Incident ) newValue );
            return;
        case CimPackage.LOCATION__HAZARDS:
            getHazards().clear();
            getHazards().addAll( ( Collection< ? extends AssetLocationHazard > ) newValue );
            return;
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            getPowerSystemResources().clear();
            getPowerSystemResources().addAll( ( Collection< ? extends PowerSystemResource > ) newValue );
            return;
        case CimPackage.LOCATION__ASSETS:
            getAssets().clear();
            getAssets().addAll( ( Collection< ? extends Asset > ) newValue );
            return;
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            setCoordinateSystem( ( CoordinateSystem ) newValue );
            return;
        case CimPackage.LOCATION__POSITION_POINTS:
            getPositionPoints().clear();
            getPositionPoints().addAll( ( Collection< ? extends PositionPoint > ) newValue );
            return;
        case CimPackage.LOCATION__MEASUREMENTS:
            getMeasurements().clear();
            getMeasurements().addAll( ( Collection< ? extends Measurement > ) newValue );
            return;
        case CimPackage.LOCATION__CONFIGURATION_EVENTS:
            getConfigurationEvents().clear();
            getConfigurationEvents().addAll( ( Collection< ? extends ConfigurationEvent > ) newValue );
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
        case CimPackage.LOCATION__DIRECTION:
            unsetDirection();
            return;
        case CimPackage.LOCATION__GEO_INFO_REFERENCE:
            unsetGeoInfoReference();
            return;
        case CimPackage.LOCATION__TYPE:
            unsetType();
            return;
        case CimPackage.LOCATION__ELECTRONIC_ADDRESS:
            unsetElectronicAddress();
            return;
        case CimPackage.LOCATION__MAIN_ADDRESS:
            unsetMainAddress();
            return;
        case CimPackage.LOCATION__PHONE1:
            unsetPhone1();
            return;
        case CimPackage.LOCATION__PHONE2:
            unsetPhone2();
            return;
        case CimPackage.LOCATION__SECONDARY_ADDRESS:
            unsetSecondaryAddress();
            return;
        case CimPackage.LOCATION__STATUS:
            unsetStatus();
            return;
        case CimPackage.LOCATION__INCIDENT:
            unsetIncident();
            return;
        case CimPackage.LOCATION__HAZARDS:
            unsetHazards();
            return;
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            unsetPowerSystemResources();
            return;
        case CimPackage.LOCATION__ASSETS:
            unsetAssets();
            return;
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            unsetCoordinateSystem();
            return;
        case CimPackage.LOCATION__POSITION_POINTS:
            unsetPositionPoints();
            return;
        case CimPackage.LOCATION__MEASUREMENTS:
            unsetMeasurements();
            return;
        case CimPackage.LOCATION__CONFIGURATION_EVENTS:
            unsetConfigurationEvents();
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
        case CimPackage.LOCATION__DIRECTION:
            return isSetDirection();
        case CimPackage.LOCATION__GEO_INFO_REFERENCE:
            return isSetGeoInfoReference();
        case CimPackage.LOCATION__TYPE:
            return isSetType();
        case CimPackage.LOCATION__ELECTRONIC_ADDRESS:
            return isSetElectronicAddress();
        case CimPackage.LOCATION__MAIN_ADDRESS:
            return isSetMainAddress();
        case CimPackage.LOCATION__PHONE1:
            return isSetPhone1();
        case CimPackage.LOCATION__PHONE2:
            return isSetPhone2();
        case CimPackage.LOCATION__SECONDARY_ADDRESS:
            return isSetSecondaryAddress();
        case CimPackage.LOCATION__STATUS:
            return isSetStatus();
        case CimPackage.LOCATION__INCIDENT:
            return isSetIncident();
        case CimPackage.LOCATION__HAZARDS:
            return isSetHazards();
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            return isSetPowerSystemResources();
        case CimPackage.LOCATION__ASSETS:
            return isSetAssets();
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            return isSetCoordinateSystem();
        case CimPackage.LOCATION__POSITION_POINTS:
            return isSetPositionPoints();
        case CimPackage.LOCATION__MEASUREMENTS:
            return isSetMeasurements();
        case CimPackage.LOCATION__CONFIGURATION_EVENTS:
            return isSetConfigurationEvents();
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
        result.append( " (direction: " );
        if( directionESet )
            result.append( direction );
        else
            result.append( "<unset>" );
        result.append( ", geoInfoReference: " );
        if( geoInfoReferenceESet )
            result.append( geoInfoReference );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LocationImpl
