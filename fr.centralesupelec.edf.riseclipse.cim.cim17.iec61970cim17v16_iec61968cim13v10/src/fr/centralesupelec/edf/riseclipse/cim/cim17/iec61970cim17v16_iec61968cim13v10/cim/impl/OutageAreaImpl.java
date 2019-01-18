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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AreaKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea;

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
 * An implementation of the model object '<em><b>Outage Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageAreaImpl#getEarliestReportedTime <em>Earliest Reported Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageAreaImpl#getMetersServed <em>Meters Served</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageAreaImpl#getOutageAreaKind <em>Outage Area Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageAreaImpl#getOutage <em>Outage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutageAreaImpl extends OutageImpl implements OutageArea {
    /**
     * The default value of the '{@link #getEarliestReportedTime() <em>Earliest Reported Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarliestReportedTime()
     * @generated
     * @ordered
     */
    protected static final Date EARLIEST_REPORTED_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEarliestReportedTime() <em>Earliest Reported Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarliestReportedTime()
     * @generated
     * @ordered
     */
    protected Date earliestReportedTime = EARLIEST_REPORTED_TIME_EDEFAULT;

    /**
     * This is true if the Earliest Reported Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean earliestReportedTimeESet;

    /**
     * The default value of the '{@link #getMetersServed() <em>Meters Served</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetersServed()
     * @generated
     * @ordered
     */
    protected static final Integer METERS_SERVED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMetersServed() <em>Meters Served</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetersServed()
     * @generated
     * @ordered
     */
    protected Integer metersServed = METERS_SERVED_EDEFAULT;

    /**
     * This is true if the Meters Served attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean metersServedESet;

    /**
     * The default value of the '{@link #getOutageAreaKind() <em>Outage Area Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutageAreaKind()
     * @generated
     * @ordered
     */
    protected static final AreaKind OUTAGE_AREA_KIND_EDEFAULT = AreaKind.BOROUGH;

    /**
     * The cached value of the '{@link #getOutageAreaKind() <em>Outage Area Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutageAreaKind()
     * @generated
     * @ordered
     */
    protected AreaKind outageAreaKind = OUTAGE_AREA_KIND_EDEFAULT;

    /**
     * This is true if the Outage Area Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outageAreaKindESet;

    /**
     * The cached value of the '{@link #getOutage() <em>Outage</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutage()
     * @generated
     * @ordered
     */
    protected EList< Outage > outage;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutageAreaImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOutageArea();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getEarliestReportedTime() {
        return earliestReportedTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEarliestReportedTime( Date newEarliestReportedTime ) {
        Date oldEarliestReportedTime = earliestReportedTime;
        earliestReportedTime = newEarliestReportedTime;
        boolean oldEarliestReportedTimeESet = earliestReportedTimeESet;
        earliestReportedTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE_AREA__EARLIEST_REPORTED_TIME,
                    oldEarliestReportedTime, earliestReportedTime, !oldEarliestReportedTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEarliestReportedTime() {
        Date oldEarliestReportedTime = earliestReportedTime;
        boolean oldEarliestReportedTimeESet = earliestReportedTimeESet;
        earliestReportedTime = EARLIEST_REPORTED_TIME_EDEFAULT;
        earliestReportedTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OUTAGE_AREA__EARLIEST_REPORTED_TIME,
                    oldEarliestReportedTime, EARLIEST_REPORTED_TIME_EDEFAULT, oldEarliestReportedTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEarliestReportedTime() {
        return earliestReportedTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMetersServed() {
        return metersServed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMetersServed( Integer newMetersServed ) {
        Integer oldMetersServed = metersServed;
        metersServed = newMetersServed;
        boolean oldMetersServedESet = metersServedESet;
        metersServedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OUTAGE_AREA__METERS_SERVED, oldMetersServed, metersServed, !oldMetersServedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMetersServed() {
        Integer oldMetersServed = metersServed;
        boolean oldMetersServedESet = metersServedESet;
        metersServed = METERS_SERVED_EDEFAULT;
        metersServedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OUTAGE_AREA__METERS_SERVED, oldMetersServed, METERS_SERVED_EDEFAULT, oldMetersServedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMetersServed() {
        return metersServedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AreaKind getOutageAreaKind() {
        return outageAreaKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutageAreaKind( AreaKind newOutageAreaKind ) {
        AreaKind oldOutageAreaKind = outageAreaKind;
        outageAreaKind = newOutageAreaKind == null ? OUTAGE_AREA_KIND_EDEFAULT : newOutageAreaKind;
        boolean oldOutageAreaKindESet = outageAreaKindESet;
        outageAreaKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OUTAGE_AREA__OUTAGE_AREA_KIND, oldOutageAreaKind, outageAreaKind, !oldOutageAreaKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutageAreaKind() {
        AreaKind oldOutageAreaKind = outageAreaKind;
        boolean oldOutageAreaKindESet = outageAreaKindESet;
        outageAreaKind = OUTAGE_AREA_KIND_EDEFAULT;
        outageAreaKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OUTAGE_AREA__OUTAGE_AREA_KIND,
                    oldOutageAreaKind, OUTAGE_AREA_KIND_EDEFAULT, oldOutageAreaKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutageAreaKind() {
        return outageAreaKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Outage > getOutage() {
        if( outage == null ) {
            outage = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Outage >( Outage.class, this,
                    CimPackage.OUTAGE_AREA__OUTAGE, CimPackage.OUTAGE__OUTAGE_AREA );
        }
        return outage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutage() {
        if( outage != null ) ( ( InternalEList.Unsettable< ? > ) outage ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutage() {
        return outage != null && ( ( InternalEList.Unsettable< ? > ) outage ).isSet();
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
        case CimPackage.OUTAGE_AREA__OUTAGE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOutage() ).basicAdd( otherEnd,
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
        case CimPackage.OUTAGE_AREA__OUTAGE:
            return ( ( InternalEList< ? > ) getOutage() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.OUTAGE_AREA__EARLIEST_REPORTED_TIME:
            return getEarliestReportedTime();
        case CimPackage.OUTAGE_AREA__METERS_SERVED:
            return getMetersServed();
        case CimPackage.OUTAGE_AREA__OUTAGE_AREA_KIND:
            return getOutageAreaKind();
        case CimPackage.OUTAGE_AREA__OUTAGE:
            return getOutage();
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
        case CimPackage.OUTAGE_AREA__EARLIEST_REPORTED_TIME:
            setEarliestReportedTime( ( Date ) newValue );
            return;
        case CimPackage.OUTAGE_AREA__METERS_SERVED:
            setMetersServed( ( Integer ) newValue );
            return;
        case CimPackage.OUTAGE_AREA__OUTAGE_AREA_KIND:
            setOutageAreaKind( ( AreaKind ) newValue );
            return;
        case CimPackage.OUTAGE_AREA__OUTAGE:
            getOutage().clear();
            getOutage().addAll( ( Collection< ? extends Outage > ) newValue );
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
        case CimPackage.OUTAGE_AREA__EARLIEST_REPORTED_TIME:
            unsetEarliestReportedTime();
            return;
        case CimPackage.OUTAGE_AREA__METERS_SERVED:
            unsetMetersServed();
            return;
        case CimPackage.OUTAGE_AREA__OUTAGE_AREA_KIND:
            unsetOutageAreaKind();
            return;
        case CimPackage.OUTAGE_AREA__OUTAGE:
            unsetOutage();
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
        case CimPackage.OUTAGE_AREA__EARLIEST_REPORTED_TIME:
            return isSetEarliestReportedTime();
        case CimPackage.OUTAGE_AREA__METERS_SERVED:
            return isSetMetersServed();
        case CimPackage.OUTAGE_AREA__OUTAGE_AREA_KIND:
            return isSetOutageAreaKind();
        case CimPackage.OUTAGE_AREA__OUTAGE:
            return isSetOutage();
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
        result.append( " (earliestReportedTime: " );
        if( earliestReportedTimeESet )
            result.append( earliestReportedTime );
        else
            result.append( "<unset>" );
        result.append( ", metersServed: " );
        if( metersServedESet )
            result.append( metersServed );
        else
            result.append( "<unset>" );
        result.append( ", outageAreaKind: " );
        if( outageAreaKindESet )
            result.append( outageAreaKind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OutageAreaImpl
