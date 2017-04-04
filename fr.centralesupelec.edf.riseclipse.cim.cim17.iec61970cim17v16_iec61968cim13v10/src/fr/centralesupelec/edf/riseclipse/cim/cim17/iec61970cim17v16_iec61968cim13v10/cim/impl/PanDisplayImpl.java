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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDisplay;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransmissionModeKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pan Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDisplayImpl#getConfirmationRequired <em>Confirmation Required</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDisplayImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDisplayImpl#getTextMessage <em>Text Message</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDisplayImpl#getTransmissionMode <em>Transmission Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PanDisplayImpl extends EndDeviceActionImpl implements PanDisplay {
    /**
     * The default value of the '{@link #getConfirmationRequired() <em>Confirmation Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfirmationRequired()
     * @generated
     * @ordered
     */
    protected static final Boolean CONFIRMATION_REQUIRED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfirmationRequired() <em>Confirmation Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfirmationRequired()
     * @generated
     * @ordered
     */
    protected Boolean confirmationRequired = CONFIRMATION_REQUIRED_EDEFAULT;

    /**
     * This is true if the Confirmation Required attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean confirmationRequiredESet;

    /**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected static final String PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected String priority = PRIORITY_EDEFAULT;

    /**
     * This is true if the Priority attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priorityESet;

    /**
     * The default value of the '{@link #getTextMessage() <em>Text Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextMessage()
     * @generated
     * @ordered
     */
    protected static final String TEXT_MESSAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTextMessage() <em>Text Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextMessage()
     * @generated
     * @ordered
     */
    protected String textMessage = TEXT_MESSAGE_EDEFAULT;

    /**
     * This is true if the Text Message attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean textMessageESet;

    /**
     * The default value of the '{@link #getTransmissionMode() <em>Transmission Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransmissionMode()
     * @generated
     * @ordered
     */
    protected static final TransmissionModeKind TRANSMISSION_MODE_EDEFAULT = TransmissionModeKind.NORMAL;

    /**
     * The cached value of the '{@link #getTransmissionMode() <em>Transmission Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransmissionMode()
     * @generated
     * @ordered
     */
    protected TransmissionModeKind transmissionMode = TRANSMISSION_MODE_EDEFAULT;

    /**
     * This is true if the Transmission Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transmissionModeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PanDisplayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPanDisplay();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getConfirmationRequired() {
        return confirmationRequired;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfirmationRequired( Boolean newConfirmationRequired ) {
        Boolean oldConfirmationRequired = confirmationRequired;
        confirmationRequired = newConfirmationRequired;
        boolean oldConfirmationRequiredESet = confirmationRequiredESet;
        confirmationRequiredESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_DISPLAY__CONFIRMATION_REQUIRED,
                    oldConfirmationRequired, confirmationRequired, !oldConfirmationRequiredESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfirmationRequired() {
        Boolean oldConfirmationRequired = confirmationRequired;
        boolean oldConfirmationRequiredESet = confirmationRequiredESet;
        confirmationRequired = CONFIRMATION_REQUIRED_EDEFAULT;
        confirmationRequiredESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_DISPLAY__CONFIRMATION_REQUIRED,
                    oldConfirmationRequired, CONFIRMATION_REQUIRED_EDEFAULT, oldConfirmationRequiredESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfirmationRequired() {
        return confirmationRequiredESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPriority() {
        return priority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPriority( String newPriority ) {
        String oldPriority = priority;
        priority = newPriority;
        boolean oldPriorityESet = priorityESet;
        priorityESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PAN_DISPLAY__PRIORITY, oldPriority, priority, !oldPriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPriority() {
        String oldPriority = priority;
        boolean oldPriorityESet = priorityESet;
        priority = PRIORITY_EDEFAULT;
        priorityESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PAN_DISPLAY__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPriority() {
        return priorityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTextMessage() {
        return textMessage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTextMessage( String newTextMessage ) {
        String oldTextMessage = textMessage;
        textMessage = newTextMessage;
        boolean oldTextMessageESet = textMessageESet;
        textMessageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PAN_DISPLAY__TEXT_MESSAGE, oldTextMessage, textMessage, !oldTextMessageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTextMessage() {
        String oldTextMessage = textMessage;
        boolean oldTextMessageESet = textMessageESet;
        textMessage = TEXT_MESSAGE_EDEFAULT;
        textMessageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PAN_DISPLAY__TEXT_MESSAGE, oldTextMessage, TEXT_MESSAGE_EDEFAULT, oldTextMessageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTextMessage() {
        return textMessageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransmissionModeKind getTransmissionMode() {
        return transmissionMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransmissionMode( TransmissionModeKind newTransmissionMode ) {
        TransmissionModeKind oldTransmissionMode = transmissionMode;
        transmissionMode = newTransmissionMode == null ? TRANSMISSION_MODE_EDEFAULT : newTransmissionMode;
        boolean oldTransmissionModeESet = transmissionModeESet;
        transmissionModeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_DISPLAY__TRANSMISSION_MODE,
                    oldTransmissionMode, transmissionMode, !oldTransmissionModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransmissionMode() {
        TransmissionModeKind oldTransmissionMode = transmissionMode;
        boolean oldTransmissionModeESet = transmissionModeESet;
        transmissionMode = TRANSMISSION_MODE_EDEFAULT;
        transmissionModeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_DISPLAY__TRANSMISSION_MODE,
                    oldTransmissionMode, TRANSMISSION_MODE_EDEFAULT, oldTransmissionModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransmissionMode() {
        return transmissionModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PAN_DISPLAY__CONFIRMATION_REQUIRED:
            return getConfirmationRequired();
        case CimPackage.PAN_DISPLAY__PRIORITY:
            return getPriority();
        case CimPackage.PAN_DISPLAY__TEXT_MESSAGE:
            return getTextMessage();
        case CimPackage.PAN_DISPLAY__TRANSMISSION_MODE:
            return getTransmissionMode();
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
        case CimPackage.PAN_DISPLAY__CONFIRMATION_REQUIRED:
            setConfirmationRequired( ( Boolean ) newValue );
            return;
        case CimPackage.PAN_DISPLAY__PRIORITY:
            setPriority( ( String ) newValue );
            return;
        case CimPackage.PAN_DISPLAY__TEXT_MESSAGE:
            setTextMessage( ( String ) newValue );
            return;
        case CimPackage.PAN_DISPLAY__TRANSMISSION_MODE:
            setTransmissionMode( ( TransmissionModeKind ) newValue );
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
        case CimPackage.PAN_DISPLAY__CONFIRMATION_REQUIRED:
            unsetConfirmationRequired();
            return;
        case CimPackage.PAN_DISPLAY__PRIORITY:
            unsetPriority();
            return;
        case CimPackage.PAN_DISPLAY__TEXT_MESSAGE:
            unsetTextMessage();
            return;
        case CimPackage.PAN_DISPLAY__TRANSMISSION_MODE:
            unsetTransmissionMode();
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
        case CimPackage.PAN_DISPLAY__CONFIRMATION_REQUIRED:
            return isSetConfirmationRequired();
        case CimPackage.PAN_DISPLAY__PRIORITY:
            return isSetPriority();
        case CimPackage.PAN_DISPLAY__TEXT_MESSAGE:
            return isSetTextMessage();
        case CimPackage.PAN_DISPLAY__TRANSMISSION_MODE:
            return isSetTransmissionMode();
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
        result.append( " (confirmationRequired: " );
        if( confirmationRequiredESet )
            result.append( confirmationRequired );
        else
            result.append( "<unset>" );
        result.append( ", priority: " );
        if( priorityESet )
            result.append( priority );
        else
            result.append( "<unset>" );
        result.append( ", textMessage: " );
        if( textMessageESet )
            result.append( textMessage );
        else
            result.append( "<unset>" );
        result.append( ", transmissionMode: " );
        if( transmissionModeESet )
            result.append( transmissionMode );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PanDisplayImpl
