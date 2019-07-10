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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChanger;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PhaseTapChangerImpl#getTransformerEnd <em>Transformer End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseTapChangerImpl extends TapChangerImpl implements PhaseTapChanger {
    /**
     * The cached value of the '{@link #getTransformerEnd() <em>Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerEnd()
     * @generated
     * @ordered
     */
    protected TransformerEnd transformerEnd;

    /**
     * This is true if the Transformer End reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transformerEndESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PhaseTapChangerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPhaseTapChanger();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEnd getTransformerEnd() {
        if( transformerEnd != null && transformerEnd.eIsProxy() ) {
            InternalEObject oldTransformerEnd = ( InternalEObject ) transformerEnd;
            transformerEnd = ( TransformerEnd ) eResolveProxy( oldTransformerEnd );
            if( transformerEnd != oldTransformerEnd ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, oldTransformerEnd, transformerEnd ) );
            }
        }
        return transformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformerEnd basicGetTransformerEnd() {
        return transformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransformerEnd( TransformerEnd newTransformerEnd, NotificationChain msgs ) {
        TransformerEnd oldTransformerEnd = transformerEnd;
        transformerEnd = newTransformerEnd;
        boolean oldTransformerEndESet = transformerEndESet;
        transformerEndESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, oldTransformerEnd, newTransformerEnd,
                    !oldTransformerEndESet );
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
    public void setTransformerEnd( TransformerEnd newTransformerEnd ) {
        if( newTransformerEnd != transformerEnd ) {
            NotificationChain msgs = null;
            if( transformerEnd != null ) msgs = ( ( InternalEObject ) transformerEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, TransformerEnd.class, msgs );
            if( newTransformerEnd != null ) msgs = ( ( InternalEObject ) newTransformerEnd ).eInverseAdd( this,
                    CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, TransformerEnd.class, msgs );
            msgs = basicSetTransformerEnd( newTransformerEnd, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerEndESet = transformerEndESet;
            transformerEndESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END,
                        newTransformerEnd, newTransformerEnd, !oldTransformerEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTransformerEnd( NotificationChain msgs ) {
        TransformerEnd oldTransformerEnd = transformerEnd;
        transformerEnd = null;
        boolean oldTransformerEndESet = transformerEndESet;
        transformerEndESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, oldTransformerEnd, null, oldTransformerEndESet );
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
    public void unsetTransformerEnd() {
        if( transformerEnd != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) transformerEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, TransformerEnd.class, msgs );
            msgs = basicUnsetTransformerEnd( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerEndESet = transformerEndESet;
            transformerEndESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, null, null, oldTransformerEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerEnd() {
        return transformerEndESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
            if( transformerEnd != null ) msgs = ( ( InternalEObject ) transformerEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, TransformerEnd.class, msgs );
            return basicSetTransformerEnd( ( TransformerEnd ) otherEnd, msgs );
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
        case CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
            return basicUnsetTransformerEnd( msgs );
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
        case CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
            if( resolve ) return getTransformerEnd();
            return basicGetTransformerEnd();
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
        case CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
            setTransformerEnd( ( TransformerEnd ) newValue );
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
        case CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
            unsetTransformerEnd();
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
        case CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
            return isSetTransformerEnd();
        }
        return super.eIsSet( featureID );
    }

} //PhaseTapChangerImpl
