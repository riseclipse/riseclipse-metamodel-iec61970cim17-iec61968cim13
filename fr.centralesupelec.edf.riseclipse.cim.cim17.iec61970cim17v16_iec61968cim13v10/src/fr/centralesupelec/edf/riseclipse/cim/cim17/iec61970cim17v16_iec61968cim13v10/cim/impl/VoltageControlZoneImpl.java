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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voltage Control Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VoltageControlZoneImpl#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VoltageControlZoneImpl#getBusbarSection <em>Busbar Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoltageControlZoneImpl extends PowerSystemResourceImpl implements VoltageControlZone {
    /**
     * The cached value of the '{@link #getRegulationSchedule() <em>Regulation Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulationSchedule()
     * @generated
     * @ordered
     */
    protected RegulationSchedule regulationSchedule;

    /**
     * This is true if the Regulation Schedule reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean regulationScheduleESet;

    /**
     * The cached value of the '{@link #getBusbarSection() <em>Busbar Section</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusbarSection()
     * @generated
     * @ordered
     */
    protected BusbarSection busbarSection;

    /**
     * This is true if the Busbar Section reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean busbarSectionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VoltageControlZoneImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVoltageControlZone();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RegulationSchedule getRegulationSchedule() {
        return regulationSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRegulationSchedule( RegulationSchedule newRegulationSchedule,
            NotificationChain msgs ) {
        RegulationSchedule oldRegulationSchedule = regulationSchedule;
        regulationSchedule = newRegulationSchedule;
        boolean oldRegulationScheduleESet = regulationScheduleESet;
        regulationScheduleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE, oldRegulationSchedule, newRegulationSchedule,
                    !oldRegulationScheduleESet );
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
    public void setRegulationSchedule( RegulationSchedule newRegulationSchedule ) {
        if( newRegulationSchedule != regulationSchedule ) {
            NotificationChain msgs = null;
            if( regulationSchedule != null ) msgs = ( ( InternalEObject ) regulationSchedule ).eInverseRemove( this,
                    CimPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES, RegulationSchedule.class, msgs );
            if( newRegulationSchedule != null ) msgs = ( ( InternalEObject ) newRegulationSchedule ).eInverseAdd( this,
                    CimPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES, RegulationSchedule.class, msgs );
            msgs = basicSetRegulationSchedule( newRegulationSchedule, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegulationScheduleESet = regulationScheduleESet;
            regulationScheduleESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE,
                            newRegulationSchedule, newRegulationSchedule, !oldRegulationScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRegulationSchedule( NotificationChain msgs ) {
        RegulationSchedule oldRegulationSchedule = regulationSchedule;
        regulationSchedule = null;
        boolean oldRegulationScheduleESet = regulationScheduleESet;
        regulationScheduleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE, oldRegulationSchedule, null,
                    oldRegulationScheduleESet );
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
    public void unsetRegulationSchedule() {
        if( regulationSchedule != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) regulationSchedule ).eInverseRemove( this,
                    CimPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES, RegulationSchedule.class, msgs );
            msgs = basicUnsetRegulationSchedule( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegulationScheduleESet = regulationScheduleESet;
            regulationScheduleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE, null, null, oldRegulationScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegulationSchedule() {
        return regulationScheduleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BusbarSection getBusbarSection() {
        return busbarSection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBusbarSection( BusbarSection newBusbarSection, NotificationChain msgs ) {
        BusbarSection oldBusbarSection = busbarSection;
        busbarSection = newBusbarSection;
        boolean oldBusbarSectionESet = busbarSectionESet;
        busbarSectionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, oldBusbarSection, newBusbarSection,
                    !oldBusbarSectionESet );
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
    public void setBusbarSection( BusbarSection newBusbarSection ) {
        if( newBusbarSection != busbarSection ) {
            NotificationChain msgs = null;
            if( busbarSection != null ) msgs = ( ( InternalEObject ) busbarSection ).eInverseRemove( this,
                    CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, BusbarSection.class, msgs );
            if( newBusbarSection != null ) msgs = ( ( InternalEObject ) newBusbarSection ).eInverseAdd( this,
                    CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, BusbarSection.class, msgs );
            msgs = basicSetBusbarSection( newBusbarSection, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBusbarSectionESet = busbarSectionESet;
            busbarSectionESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION,
                        newBusbarSection, newBusbarSection, !oldBusbarSectionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBusbarSection( NotificationChain msgs ) {
        BusbarSection oldBusbarSection = busbarSection;
        busbarSection = null;
        boolean oldBusbarSectionESet = busbarSectionESet;
        busbarSectionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, oldBusbarSection, null, oldBusbarSectionESet );
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
    public void unsetBusbarSection() {
        if( busbarSection != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) busbarSection ).eInverseRemove( this,
                    CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, BusbarSection.class, msgs );
            msgs = basicUnsetBusbarSection( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBusbarSectionESet = busbarSectionESet;
            busbarSectionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, null, null, oldBusbarSectionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBusbarSection() {
        return busbarSectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
            if( regulationSchedule != null ) msgs = ( ( InternalEObject ) regulationSchedule ).eInverseRemove( this,
                    CimPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES, RegulationSchedule.class, msgs );
            return basicSetRegulationSchedule( ( RegulationSchedule ) otherEnd, msgs );
        case CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
            if( busbarSection != null ) msgs = ( ( InternalEObject ) busbarSection ).eInverseRemove( this,
                    CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, BusbarSection.class, msgs );
            return basicSetBusbarSection( ( BusbarSection ) otherEnd, msgs );
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
        case CimPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
            return basicUnsetRegulationSchedule( msgs );
        case CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
            return basicUnsetBusbarSection( msgs );
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
        case CimPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
            return getRegulationSchedule();
        case CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
            return getBusbarSection();
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
        case CimPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
            setRegulationSchedule( ( RegulationSchedule ) newValue );
            return;
        case CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
            setBusbarSection( ( BusbarSection ) newValue );
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
        case CimPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
            unsetRegulationSchedule();
            return;
        case CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
            unsetBusbarSection();
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
        case CimPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
            return isSetRegulationSchedule();
        case CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
            return isSetBusbarSection();
        }
        return super.eIsSet( featureID );
    }

} //VoltageControlZoneImpl
