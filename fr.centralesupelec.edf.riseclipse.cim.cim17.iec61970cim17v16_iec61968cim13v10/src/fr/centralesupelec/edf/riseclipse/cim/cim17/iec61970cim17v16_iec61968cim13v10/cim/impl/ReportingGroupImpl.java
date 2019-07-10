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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusNameMarker;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingSuperGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode;

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
 * An implementation of the model object '<em><b>Reporting Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReportingGroupImpl#getReportingSuperGroup <em>Reporting Super Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReportingGroupImpl#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReportingGroupImpl#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReportingGroupImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportingGroupImpl extends IdentifiedObjectImpl implements ReportingGroup {
    /**
     * The cached value of the '{@link #getReportingSuperGroup() <em>Reporting Super Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportingSuperGroup()
     * @generated
     * @ordered
     */
    protected ReportingSuperGroup reportingSuperGroup;

    /**
     * This is true if the Reporting Super Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reportingSuperGroupESet;

    /**
     * The cached value of the '{@link #getBusNameMarker() <em>Bus Name Marker</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusNameMarker()
     * @generated
     * @ordered
     */
    protected EList< BusNameMarker > busNameMarker;

    /**
     * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopologicalNode()
     * @generated
     * @ordered
     */
    protected EList< TopologicalNode > topologicalNode;

    /**
     * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResource()
     * @generated
     * @ordered
     */
    protected EList< PowerSystemResource > powerSystemResource;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReportingGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getReportingGroup();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportingSuperGroup getReportingSuperGroup() {
        return reportingSuperGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReportingSuperGroup( ReportingSuperGroup newReportingSuperGroup,
            NotificationChain msgs ) {
        ReportingSuperGroup oldReportingSuperGroup = reportingSuperGroup;
        reportingSuperGroup = newReportingSuperGroup;
        boolean oldReportingSuperGroupESet = reportingSuperGroupESet;
        reportingSuperGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.REPORTING_GROUP__REPORTING_SUPER_GROUP, oldReportingSuperGroup, newReportingSuperGroup,
                    !oldReportingSuperGroupESet );
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
    public void setReportingSuperGroup( ReportingSuperGroup newReportingSuperGroup ) {
        if( newReportingSuperGroup != reportingSuperGroup ) {
            NotificationChain msgs = null;
            if( reportingSuperGroup != null ) msgs = ( ( InternalEObject ) reportingSuperGroup ).eInverseRemove( this,
                    CimPackage.REPORTING_SUPER_GROUP__REPORTING_GROUP, ReportingSuperGroup.class, msgs );
            if( newReportingSuperGroup != null )
                msgs = ( ( InternalEObject ) newReportingSuperGroup ).eInverseAdd( this,
                        CimPackage.REPORTING_SUPER_GROUP__REPORTING_GROUP, ReportingSuperGroup.class, msgs );
            msgs = basicSetReportingSuperGroup( newReportingSuperGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReportingSuperGroupESet = reportingSuperGroupESet;
            reportingSuperGroupESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.REPORTING_GROUP__REPORTING_SUPER_GROUP,
                            newReportingSuperGroup, newReportingSuperGroup, !oldReportingSuperGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReportingSuperGroup( NotificationChain msgs ) {
        ReportingSuperGroup oldReportingSuperGroup = reportingSuperGroup;
        reportingSuperGroup = null;
        boolean oldReportingSuperGroupESet = reportingSuperGroupESet;
        reportingSuperGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REPORTING_GROUP__REPORTING_SUPER_GROUP, oldReportingSuperGroup, null,
                    oldReportingSuperGroupESet );
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
    public void unsetReportingSuperGroup() {
        if( reportingSuperGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) reportingSuperGroup ).eInverseRemove( this,
                    CimPackage.REPORTING_SUPER_GROUP__REPORTING_GROUP, ReportingSuperGroup.class, msgs );
            msgs = basicUnsetReportingSuperGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReportingSuperGroupESet = reportingSuperGroupESet;
            reportingSuperGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.REPORTING_GROUP__REPORTING_SUPER_GROUP, null, null, oldReportingSuperGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReportingSuperGroup() {
        return reportingSuperGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BusNameMarker > getBusNameMarker() {
        if( busNameMarker == null ) {
            busNameMarker = new EObjectWithInverseResolvingEList.Unsettable< BusNameMarker >( BusNameMarker.class, this,
                    CimPackage.REPORTING_GROUP__BUS_NAME_MARKER, CimPackage.BUS_NAME_MARKER__REPORTING_GROUP );
        }
        return busNameMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBusNameMarker() {
        if( busNameMarker != null ) ( ( InternalEList.Unsettable< ? > ) busNameMarker ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBusNameMarker() {
        return busNameMarker != null && ( ( InternalEList.Unsettable< ? > ) busNameMarker ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TopologicalNode > getTopologicalNode() {
        if( topologicalNode == null ) {
            topologicalNode = new EObjectWithInverseResolvingEList.Unsettable< TopologicalNode >( TopologicalNode.class,
                    this, CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE, CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP );
        }
        return topologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTopologicalNode() {
        if( topologicalNode != null ) ( ( InternalEList.Unsettable< ? > ) topologicalNode ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTopologicalNode() {
        return topologicalNode != null && ( ( InternalEList.Unsettable< ? > ) topologicalNode ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerSystemResource > getPowerSystemResource() {
        if( powerSystemResource == null ) {
            powerSystemResource = new EObjectWithInverseEList.Unsettable.ManyInverse< PowerSystemResource >(
                    PowerSystemResource.class, this, CimPackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE,
                    CimPackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP );
        }
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerSystemResource() {
        if( powerSystemResource != null ) ( ( InternalEList.Unsettable< ? > ) powerSystemResource ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResource() {
        return powerSystemResource != null && ( ( InternalEList.Unsettable< ? > ) powerSystemResource ).isSet();
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
        case CimPackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
            if( reportingSuperGroup != null ) msgs = ( ( InternalEObject ) reportingSuperGroup ).eInverseRemove( this,
                    CimPackage.REPORTING_SUPER_GROUP__REPORTING_GROUP, ReportingSuperGroup.class, msgs );
            return basicSetReportingSuperGroup( ( ReportingSuperGroup ) otherEnd, msgs );
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBusNameMarker() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTopologicalNode() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerSystemResource() )
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
        case CimPackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
            return basicUnsetReportingSuperGroup( msgs );
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            return ( ( InternalEList< ? > ) getBusNameMarker() ).basicRemove( otherEnd, msgs );
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            return ( ( InternalEList< ? > ) getTopologicalNode() ).basicRemove( otherEnd, msgs );
        case CimPackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
            return ( ( InternalEList< ? > ) getPowerSystemResource() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
            return getReportingSuperGroup();
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            return getBusNameMarker();
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            return getTopologicalNode();
        case CimPackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
            return getPowerSystemResource();
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
        case CimPackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
            setReportingSuperGroup( ( ReportingSuperGroup ) newValue );
            return;
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            getBusNameMarker().clear();
            getBusNameMarker().addAll( ( Collection< ? extends BusNameMarker > ) newValue );
            return;
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            getTopologicalNode().clear();
            getTopologicalNode().addAll( ( Collection< ? extends TopologicalNode > ) newValue );
            return;
        case CimPackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
            getPowerSystemResource().clear();
            getPowerSystemResource().addAll( ( Collection< ? extends PowerSystemResource > ) newValue );
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
        case CimPackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
            unsetReportingSuperGroup();
            return;
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            unsetBusNameMarker();
            return;
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            unsetTopologicalNode();
            return;
        case CimPackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
            unsetPowerSystemResource();
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
        case CimPackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
            return isSetReportingSuperGroup();
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            return isSetBusNameMarker();
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            return isSetTopologicalNode();
        case CimPackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
            return isSetPowerSystemResource();
        }
        return super.eIsSet( featureID );
    }

} //ReportingGroupImpl
