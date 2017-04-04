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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceActionImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceActionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceActionImpl#getDurationIndefinite <em>Duration Indefinite</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceActionImpl#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceActionImpl#getEndDeviceControl <em>End Device Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceActionImpl extends CimObjectWithIDImpl implements EndDeviceAction {
    /**
     * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommand()
     * @generated
     * @ordered
     */
    protected static final String COMMAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommand()
     * @generated
     * @ordered
     */
    protected String command = COMMAND_EDEFAULT;

    /**
     * This is true if the Command attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean commandESet;

    /**
     * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected static final Float DURATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected Float duration = DURATION_EDEFAULT;

    /**
     * This is true if the Duration attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean durationESet;

    /**
     * The default value of the '{@link #getDurationIndefinite() <em>Duration Indefinite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDurationIndefinite()
     * @generated
     * @ordered
     */
    protected static final Boolean DURATION_INDEFINITE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDurationIndefinite() <em>Duration Indefinite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDurationIndefinite()
     * @generated
     * @ordered
     */
    protected Boolean durationIndefinite = DURATION_INDEFINITE_EDEFAULT;

    /**
     * This is true if the Duration Indefinite attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean durationIndefiniteESet;

    /**
     * The default value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDateTime()
     * @generated
     * @ordered
     */
    protected static final Date START_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDateTime()
     * @generated
     * @ordered
     */
    protected Date startDateTime = START_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Start Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startDateTimeESet;

    /**
     * The cached value of the '{@link #getEndDeviceControl() <em>End Device Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceControl()
     * @generated
     * @ordered
     */
    protected EndDeviceControl endDeviceControl;

    /**
     * This is true if the End Device Control reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDeviceControlESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDeviceAction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCommand() {
        return command;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCommand( String newCommand ) {
        String oldCommand = command;
        command = newCommand;
        boolean oldCommandESet = commandESet;
        commandESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_ACTION__COMMAND, oldCommand, command, !oldCommandESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCommand() {
        String oldCommand = command;
        boolean oldCommandESet = commandESet;
        command = COMMAND_EDEFAULT;
        commandESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_ACTION__COMMAND, oldCommand, COMMAND_EDEFAULT, oldCommandESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCommand() {
        return commandESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDuration() {
        return duration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDuration( Float newDuration ) {
        Float oldDuration = duration;
        duration = newDuration;
        boolean oldDurationESet = durationESet;
        durationESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_ACTION__DURATION, oldDuration, duration, !oldDurationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDuration() {
        Float oldDuration = duration;
        boolean oldDurationESet = durationESet;
        duration = DURATION_EDEFAULT;
        durationESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_ACTION__DURATION, oldDuration, DURATION_EDEFAULT, oldDurationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDuration() {
        return durationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDurationIndefinite() {
        return durationIndefinite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDurationIndefinite( Boolean newDurationIndefinite ) {
        Boolean oldDurationIndefinite = durationIndefinite;
        durationIndefinite = newDurationIndefinite;
        boolean oldDurationIndefiniteESet = durationIndefiniteESet;
        durationIndefiniteESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_ACTION__DURATION_INDEFINITE,
                    oldDurationIndefinite, durationIndefinite, !oldDurationIndefiniteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDurationIndefinite() {
        Boolean oldDurationIndefinite = durationIndefinite;
        boolean oldDurationIndefiniteESet = durationIndefiniteESet;
        durationIndefinite = DURATION_INDEFINITE_EDEFAULT;
        durationIndefiniteESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_ACTION__DURATION_INDEFINITE,
                    oldDurationIndefinite, DURATION_INDEFINITE_EDEFAULT, oldDurationIndefiniteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDurationIndefinite() {
        return durationIndefiniteESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getStartDateTime() {
        return startDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartDateTime( Date newStartDateTime ) {
        Date oldStartDateTime = startDateTime;
        startDateTime = newStartDateTime;
        boolean oldStartDateTimeESet = startDateTimeESet;
        startDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_ACTION__START_DATE_TIME,
                    oldStartDateTime, startDateTime, !oldStartDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartDateTime() {
        Date oldStartDateTime = startDateTime;
        boolean oldStartDateTimeESet = startDateTimeESet;
        startDateTime = START_DATE_TIME_EDEFAULT;
        startDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_ACTION__START_DATE_TIME,
                    oldStartDateTime, START_DATE_TIME_EDEFAULT, oldStartDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartDateTime() {
        return startDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EndDeviceControl getEndDeviceControl() {
        if( endDeviceControl != null && endDeviceControl.eIsProxy() ) {
            InternalEObject oldEndDeviceControl = ( InternalEObject ) endDeviceControl;
            endDeviceControl = ( EndDeviceControl ) eResolveProxy( oldEndDeviceControl );
            if( endDeviceControl != oldEndDeviceControl ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL, oldEndDeviceControl, endDeviceControl ) );
            }
        }
        return endDeviceControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndDeviceControl basicGetEndDeviceControl() {
        return endDeviceControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndDeviceControl( EndDeviceControl newEndDeviceControl, NotificationChain msgs ) {
        EndDeviceControl oldEndDeviceControl = endDeviceControl;
        endDeviceControl = newEndDeviceControl;
        boolean oldEndDeviceControlESet = endDeviceControlESet;
        endDeviceControlESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL, oldEndDeviceControl, newEndDeviceControl,
                    !oldEndDeviceControlESet );
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
    public void setEndDeviceControl( EndDeviceControl newEndDeviceControl ) {
        if( newEndDeviceControl != endDeviceControl ) {
            NotificationChain msgs = null;
            if( endDeviceControl != null ) msgs = ( ( InternalEObject ) endDeviceControl ).eInverseRemove( this,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION, EndDeviceControl.class, msgs );
            if( newEndDeviceControl != null ) msgs = ( ( InternalEObject ) newEndDeviceControl ).eInverseAdd( this,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION, EndDeviceControl.class, msgs );
            msgs = basicSetEndDeviceControl( newEndDeviceControl, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceControlESet = endDeviceControlESet;
            endDeviceControlESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL,
                            newEndDeviceControl, newEndDeviceControl, !oldEndDeviceControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEndDeviceControl( NotificationChain msgs ) {
        EndDeviceControl oldEndDeviceControl = endDeviceControl;
        endDeviceControl = null;
        boolean oldEndDeviceControlESet = endDeviceControlESet;
        endDeviceControlESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL, oldEndDeviceControl, null,
                    oldEndDeviceControlESet );
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
    public void unsetEndDeviceControl() {
        if( endDeviceControl != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) endDeviceControl ).eInverseRemove( this,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION, EndDeviceControl.class, msgs );
            msgs = basicUnsetEndDeviceControl( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEndDeviceControlESet = endDeviceControlESet;
            endDeviceControlESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL, null, null, oldEndDeviceControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceControl() {
        return endDeviceControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL:
            if( endDeviceControl != null ) msgs = ( ( InternalEObject ) endDeviceControl ).eInverseRemove( this,
                    CimPackage.END_DEVICE_CONTROL__END_DEVICE_ACTION, EndDeviceControl.class, msgs );
            return basicSetEndDeviceControl( ( EndDeviceControl ) otherEnd, msgs );
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
        case CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL:
            return basicUnsetEndDeviceControl( msgs );
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
        case CimPackage.END_DEVICE_ACTION__COMMAND:
            return getCommand();
        case CimPackage.END_DEVICE_ACTION__DURATION:
            return getDuration();
        case CimPackage.END_DEVICE_ACTION__DURATION_INDEFINITE:
            return getDurationIndefinite();
        case CimPackage.END_DEVICE_ACTION__START_DATE_TIME:
            return getStartDateTime();
        case CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL:
            if( resolve ) return getEndDeviceControl();
            return basicGetEndDeviceControl();
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
        case CimPackage.END_DEVICE_ACTION__COMMAND:
            setCommand( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_ACTION__DURATION:
            setDuration( ( Float ) newValue );
            return;
        case CimPackage.END_DEVICE_ACTION__DURATION_INDEFINITE:
            setDurationIndefinite( ( Boolean ) newValue );
            return;
        case CimPackage.END_DEVICE_ACTION__START_DATE_TIME:
            setStartDateTime( ( Date ) newValue );
            return;
        case CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL:
            setEndDeviceControl( ( EndDeviceControl ) newValue );
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
        case CimPackage.END_DEVICE_ACTION__COMMAND:
            unsetCommand();
            return;
        case CimPackage.END_DEVICE_ACTION__DURATION:
            unsetDuration();
            return;
        case CimPackage.END_DEVICE_ACTION__DURATION_INDEFINITE:
            unsetDurationIndefinite();
            return;
        case CimPackage.END_DEVICE_ACTION__START_DATE_TIME:
            unsetStartDateTime();
            return;
        case CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL:
            unsetEndDeviceControl();
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
        case CimPackage.END_DEVICE_ACTION__COMMAND:
            return isSetCommand();
        case CimPackage.END_DEVICE_ACTION__DURATION:
            return isSetDuration();
        case CimPackage.END_DEVICE_ACTION__DURATION_INDEFINITE:
            return isSetDurationIndefinite();
        case CimPackage.END_DEVICE_ACTION__START_DATE_TIME:
            return isSetStartDateTime();
        case CimPackage.END_DEVICE_ACTION__END_DEVICE_CONTROL:
            return isSetEndDeviceControl();
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
        result.append( " (command: " );
        if( commandESet )
            result.append( command );
        else
            result.append( "<unset>" );
        result.append( ", duration: " );
        if( durationESet )
            result.append( duration );
        else
            result.append( "<unset>" );
        result.append( ", durationIndefinite: " );
        if( durationIndefiniteESet )
            result.append( durationIndefinite );
        else
            result.append( "<unset>" );
        result.append( ", startDateTime: " );
        if( startDateTimeESet )
            result.append( startDateTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EndDeviceActionImpl
