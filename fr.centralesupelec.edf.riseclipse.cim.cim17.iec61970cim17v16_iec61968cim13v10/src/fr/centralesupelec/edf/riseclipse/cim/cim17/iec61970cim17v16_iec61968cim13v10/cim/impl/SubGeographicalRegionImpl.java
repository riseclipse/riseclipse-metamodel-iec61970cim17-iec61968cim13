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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCLine;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeographicalRegion;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Line;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubGeographicalRegion;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Substation;

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
 * An implementation of the model object '<em><b>Sub Geographical Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SubGeographicalRegionImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SubGeographicalRegionImpl#getSubstations <em>Substations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SubGeographicalRegionImpl#getDCLines <em>DC Lines</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SubGeographicalRegionImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubGeographicalRegionImpl extends IdentifiedObjectImpl implements SubGeographicalRegion {
    /**
     * The cached value of the '{@link #getLines() <em>Lines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLines()
     * @generated
     * @ordered
     */
    protected EList< Line > lines;

    /**
     * The cached value of the '{@link #getSubstations() <em>Substations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubstations()
     * @generated
     * @ordered
     */
    protected EList< Substation > substations;

    /**
     * The cached value of the '{@link #getDCLines() <em>DC Lines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCLines()
     * @generated
     * @ordered
     */
    protected EList< DCLine > dcLines;

    /**
     * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegion()
     * @generated
     * @ordered
     */
    protected GeographicalRegion region;

    /**
     * This is true if the Region reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean regionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubGeographicalRegionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSubGeographicalRegion();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Line > getLines() {
        if( lines == null ) {
            lines = new EObjectWithInverseResolvingEList.Unsettable< Line >( Line.class, this,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__LINES, CimPackage.LINE__REGION );
        }
        return lines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLines() {
        if( lines != null ) ( ( InternalEList.Unsettable< ? > ) lines ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLines() {
        return lines != null && ( ( InternalEList.Unsettable< ? > ) lines ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Substation > getSubstations() {
        if( substations == null ) {
            substations = new EObjectWithInverseResolvingEList.Unsettable< Substation >( Substation.class, this,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, CimPackage.SUBSTATION__REGION );
        }
        return substations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubstations() {
        if( substations != null ) ( ( InternalEList.Unsettable< ? > ) substations ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubstations() {
        return substations != null && ( ( InternalEList.Unsettable< ? > ) substations ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DCLine > getDCLines() {
        if( dcLines == null ) {
            dcLines = new EObjectWithInverseResolvingEList.Unsettable< DCLine >( DCLine.class, this,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__DC_LINES, CimPackage.DC_LINE__REGION );
        }
        return dcLines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDCLines() {
        if( dcLines != null ) ( ( InternalEList.Unsettable< ? > ) dcLines ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCLines() {
        return dcLines != null && ( ( InternalEList.Unsettable< ? > ) dcLines ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeographicalRegion getRegion() {
        return region;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRegion( GeographicalRegion newRegion, NotificationChain msgs ) {
        GeographicalRegion oldRegion = region;
        region = newRegion;
        boolean oldRegionESet = regionESet;
        regionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__REGION, oldRegion, newRegion, !oldRegionESet );
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
    public void setRegion( GeographicalRegion newRegion ) {
        if( newRegion != region ) {
            NotificationChain msgs = null;
            if( region != null ) msgs = ( ( InternalEObject ) region ).eInverseRemove( this,
                    CimPackage.GEOGRAPHICAL_REGION__REGIONS, GeographicalRegion.class, msgs );
            if( newRegion != null ) msgs = ( ( InternalEObject ) newRegion ).eInverseAdd( this,
                    CimPackage.GEOGRAPHICAL_REGION__REGIONS, GeographicalRegion.class, msgs );
            msgs = basicSetRegion( newRegion, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegionESet = regionESet;
            regionESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__REGION, newRegion, newRegion, !oldRegionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRegion( NotificationChain msgs ) {
        GeographicalRegion oldRegion = region;
        region = null;
        boolean oldRegionESet = regionESet;
        regionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__REGION, oldRegion, null, oldRegionESet );
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
    public void unsetRegion() {
        if( region != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) region ).eInverseRemove( this, CimPackage.GEOGRAPHICAL_REGION__REGIONS,
                    GeographicalRegion.class, msgs );
            msgs = basicUnsetRegion( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegionESet = regionESet;
            regionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__REGION, null, null, oldRegionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegion() {
        return regionESet;
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
        case CimPackage.SUB_GEOGRAPHICAL_REGION__LINES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLines() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubstations() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.SUB_GEOGRAPHICAL_REGION__DC_LINES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDCLines() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.SUB_GEOGRAPHICAL_REGION__REGION:
            if( region != null ) msgs = ( ( InternalEObject ) region ).eInverseRemove( this,
                    CimPackage.GEOGRAPHICAL_REGION__REGIONS, GeographicalRegion.class, msgs );
            return basicSetRegion( ( GeographicalRegion ) otherEnd, msgs );
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
        case CimPackage.SUB_GEOGRAPHICAL_REGION__LINES:
            return ( ( InternalEList< ? > ) getLines() ).basicRemove( otherEnd, msgs );
        case CimPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
            return ( ( InternalEList< ? > ) getSubstations() ).basicRemove( otherEnd, msgs );
        case CimPackage.SUB_GEOGRAPHICAL_REGION__DC_LINES:
            return ( ( InternalEList< ? > ) getDCLines() ).basicRemove( otherEnd, msgs );
        case CimPackage.SUB_GEOGRAPHICAL_REGION__REGION:
            return basicUnsetRegion( msgs );
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
        case CimPackage.SUB_GEOGRAPHICAL_REGION__LINES:
            return getLines();
        case CimPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
            return getSubstations();
        case CimPackage.SUB_GEOGRAPHICAL_REGION__DC_LINES:
            return getDCLines();
        case CimPackage.SUB_GEOGRAPHICAL_REGION__REGION:
            return getRegion();
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
        case CimPackage.SUB_GEOGRAPHICAL_REGION__LINES:
            getLines().clear();
            getLines().addAll( ( Collection< ? extends Line > ) newValue );
            return;
        case CimPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
            getSubstations().clear();
            getSubstations().addAll( ( Collection< ? extends Substation > ) newValue );
            return;
        case CimPackage.SUB_GEOGRAPHICAL_REGION__DC_LINES:
            getDCLines().clear();
            getDCLines().addAll( ( Collection< ? extends DCLine > ) newValue );
            return;
        case CimPackage.SUB_GEOGRAPHICAL_REGION__REGION:
            setRegion( ( GeographicalRegion ) newValue );
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
        case CimPackage.SUB_GEOGRAPHICAL_REGION__LINES:
            unsetLines();
            return;
        case CimPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
            unsetSubstations();
            return;
        case CimPackage.SUB_GEOGRAPHICAL_REGION__DC_LINES:
            unsetDCLines();
            return;
        case CimPackage.SUB_GEOGRAPHICAL_REGION__REGION:
            unsetRegion();
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
        case CimPackage.SUB_GEOGRAPHICAL_REGION__LINES:
            return isSetLines();
        case CimPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
            return isSetSubstations();
        case CimPackage.SUB_GEOGRAPHICAL_REGION__DC_LINES:
            return isSetDCLines();
        case CimPackage.SUB_GEOGRAPHICAL_REGION__REGION:
            return isSetRegion();
        }
        return super.eIsSet( featureID );
    }

} //SubGeographicalRegionImpl
