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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusNameMarker;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalLimitSet;

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
 * An implementation of the model object '<em><b>ACDC Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCTerminalImpl#getConnected <em>Connected</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCTerminalImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCTerminalImpl#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCTerminalImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCTerminalImpl#getBusNameMarker <em>Bus Name Marker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACDCTerminalImpl extends IdentifiedObjectImpl implements ACDCTerminal {
    /**
     * The default value of the '{@link #getConnected() <em>Connected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnected()
     * @generated
     * @ordered
     */
    protected static final Boolean CONNECTED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnected() <em>Connected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnected()
     * @generated
     * @ordered
     */
    protected Boolean connected = CONNECTED_EDEFAULT;

    /**
     * This is true if the Connected attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectedESet;

    /**
     * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected static final Integer SEQUENCE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected Integer sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

    /**
     * This is true if the Sequence Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sequenceNumberESet;

    /**
     * The cached value of the '{@link #getOperationalLimitSet() <em>Operational Limit Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalLimitSet()
     * @generated
     * @ordered
     */
    protected EList< OperationalLimitSet > operationalLimitSet;

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
     * The cached value of the '{@link #getBusNameMarker() <em>Bus Name Marker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusNameMarker()
     * @generated
     * @ordered
     */
    protected BusNameMarker busNameMarker;

    /**
     * This is true if the Bus Name Marker reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean busNameMarkerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ACDCTerminalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getACDCTerminal();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getConnected() {
        return connected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConnected( Boolean newConnected ) {
        Boolean oldConnected = connected;
        connected = newConnected;
        boolean oldConnectedESet = connectedESet;
        connectedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_TERMINAL__CONNECTED, oldConnected, connected, !oldConnectedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnected() {
        Boolean oldConnected = connected;
        boolean oldConnectedESet = connectedESet;
        connected = CONNECTED_EDEFAULT;
        connectedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_TERMINAL__CONNECTED, oldConnected, CONNECTED_EDEFAULT, oldConnectedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnected() {
        return connectedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSequenceNumber( Integer newSequenceNumber ) {
        Integer oldSequenceNumber = sequenceNumber;
        sequenceNumber = newSequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ACDC_TERMINAL__SEQUENCE_NUMBER,
                    oldSequenceNumber, sequenceNumber, !oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSequenceNumber() {
        Integer oldSequenceNumber = sequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
        sequenceNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ACDC_TERMINAL__SEQUENCE_NUMBER,
                    oldSequenceNumber, SEQUENCE_NUMBER_EDEFAULT, oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSequenceNumber() {
        return sequenceNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationalLimitSet > getOperationalLimitSet() {
        if( operationalLimitSet == null ) {
            operationalLimitSet = new EObjectWithInverseResolvingEList.Unsettable< OperationalLimitSet >(
                    OperationalLimitSet.class, this, CimPackage.ACDC_TERMINAL__OPERATIONAL_LIMIT_SET,
                    CimPackage.OPERATIONAL_LIMIT_SET__TERMINAL );
        }
        return operationalLimitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalLimitSet() {
        if( operationalLimitSet != null ) ( ( InternalEList.Unsettable< ? > ) operationalLimitSet ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalLimitSet() {
        return operationalLimitSet != null && ( ( InternalEList.Unsettable< ? > ) operationalLimitSet ).isSet();
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
                    CimPackage.ACDC_TERMINAL__MEASUREMENTS, CimPackage.MEASUREMENT__TERMINAL );
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
    public BusNameMarker getBusNameMarker() {
        return busNameMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBusNameMarker( BusNameMarker newBusNameMarker, NotificationChain msgs ) {
        BusNameMarker oldBusNameMarker = busNameMarker;
        busNameMarker = newBusNameMarker;
        boolean oldBusNameMarkerESet = busNameMarkerESet;
        busNameMarkerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER, oldBusNameMarker, newBusNameMarker,
                    !oldBusNameMarkerESet );
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
    public void setBusNameMarker( BusNameMarker newBusNameMarker ) {
        if( newBusNameMarker != busNameMarker ) {
            NotificationChain msgs = null;
            if( busNameMarker != null ) msgs = ( ( InternalEObject ) busNameMarker ).eInverseRemove( this,
                    CimPackage.BUS_NAME_MARKER__TERMINAL, BusNameMarker.class, msgs );
            if( newBusNameMarker != null ) msgs = ( ( InternalEObject ) newBusNameMarker ).eInverseAdd( this,
                    CimPackage.BUS_NAME_MARKER__TERMINAL, BusNameMarker.class, msgs );
            msgs = basicSetBusNameMarker( newBusNameMarker, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBusNameMarkerESet = busNameMarkerESet;
            busNameMarkerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER,
                        newBusNameMarker, newBusNameMarker, !oldBusNameMarkerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBusNameMarker( NotificationChain msgs ) {
        BusNameMarker oldBusNameMarker = busNameMarker;
        busNameMarker = null;
        boolean oldBusNameMarkerESet = busNameMarkerESet;
        busNameMarkerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER, oldBusNameMarker, null, oldBusNameMarkerESet );
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
    public void unsetBusNameMarker() {
        if( busNameMarker != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) busNameMarker ).eInverseRemove( this, CimPackage.BUS_NAME_MARKER__TERMINAL,
                    BusNameMarker.class, msgs );
            msgs = basicUnsetBusNameMarker( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBusNameMarkerESet = busNameMarkerESet;
            busNameMarkerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER, null, null, oldBusNameMarkerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBusNameMarker() {
        return busNameMarkerESet;
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
        case CimPackage.ACDC_TERMINAL__OPERATIONAL_LIMIT_SET:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperationalLimitSet() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ACDC_TERMINAL__MEASUREMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeasurements() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER:
            if( busNameMarker != null ) msgs = ( ( InternalEObject ) busNameMarker ).eInverseRemove( this,
                    CimPackage.BUS_NAME_MARKER__TERMINAL, BusNameMarker.class, msgs );
            return basicSetBusNameMarker( ( BusNameMarker ) otherEnd, msgs );
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
        case CimPackage.ACDC_TERMINAL__OPERATIONAL_LIMIT_SET:
            return ( ( InternalEList< ? > ) getOperationalLimitSet() ).basicRemove( otherEnd, msgs );
        case CimPackage.ACDC_TERMINAL__MEASUREMENTS:
            return ( ( InternalEList< ? > ) getMeasurements() ).basicRemove( otherEnd, msgs );
        case CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER:
            return basicUnsetBusNameMarker( msgs );
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
        case CimPackage.ACDC_TERMINAL__CONNECTED:
            return getConnected();
        case CimPackage.ACDC_TERMINAL__SEQUENCE_NUMBER:
            return getSequenceNumber();
        case CimPackage.ACDC_TERMINAL__OPERATIONAL_LIMIT_SET:
            return getOperationalLimitSet();
        case CimPackage.ACDC_TERMINAL__MEASUREMENTS:
            return getMeasurements();
        case CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER:
            return getBusNameMarker();
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
        case CimPackage.ACDC_TERMINAL__CONNECTED:
            setConnected( ( Boolean ) newValue );
            return;
        case CimPackage.ACDC_TERMINAL__SEQUENCE_NUMBER:
            setSequenceNumber( ( Integer ) newValue );
            return;
        case CimPackage.ACDC_TERMINAL__OPERATIONAL_LIMIT_SET:
            getOperationalLimitSet().clear();
            getOperationalLimitSet().addAll( ( Collection< ? extends OperationalLimitSet > ) newValue );
            return;
        case CimPackage.ACDC_TERMINAL__MEASUREMENTS:
            getMeasurements().clear();
            getMeasurements().addAll( ( Collection< ? extends Measurement > ) newValue );
            return;
        case CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER:
            setBusNameMarker( ( BusNameMarker ) newValue );
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
        case CimPackage.ACDC_TERMINAL__CONNECTED:
            unsetConnected();
            return;
        case CimPackage.ACDC_TERMINAL__SEQUENCE_NUMBER:
            unsetSequenceNumber();
            return;
        case CimPackage.ACDC_TERMINAL__OPERATIONAL_LIMIT_SET:
            unsetOperationalLimitSet();
            return;
        case CimPackage.ACDC_TERMINAL__MEASUREMENTS:
            unsetMeasurements();
            return;
        case CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER:
            unsetBusNameMarker();
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
        case CimPackage.ACDC_TERMINAL__CONNECTED:
            return isSetConnected();
        case CimPackage.ACDC_TERMINAL__SEQUENCE_NUMBER:
            return isSetSequenceNumber();
        case CimPackage.ACDC_TERMINAL__OPERATIONAL_LIMIT_SET:
            return isSetOperationalLimitSet();
        case CimPackage.ACDC_TERMINAL__MEASUREMENTS:
            return isSetMeasurements();
        case CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER:
            return isSetBusNameMarker();
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
        result.append( " (connected: " );
        if( connectedESet )
            result.append( connected );
        else
            result.append( "<unset>" );
        result.append( ", sequenceNumber: " );
        if( sequenceNumberESet )
            result.append( sequenceNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ACDCTerminalImpl
