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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer Mesh Impedance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerMeshImpedanceImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerMeshImpedanceImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerMeshImpedanceImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerMeshImpedanceImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerMeshImpedanceImpl#getToTransformerEnd <em>To Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerMeshImpedanceImpl#getFromTransformerEndInfo <em>From Transformer End Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerMeshImpedanceImpl#getFromTransformerEnd <em>From Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerMeshImpedanceImpl#getToTransformerEndInfos <em>To Transformer End Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerMeshImpedanceImpl extends IdentifiedObjectImpl implements TransformerMeshImpedance {
    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Float R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Float r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected static final Float R0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected Float r0 = R0_EDEFAULT;

    /**
     * This is true if the R0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r0ESet;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final Float X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected Float x = X_EDEFAULT;

    /**
     * This is true if the X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xESet;

    /**
     * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected static final Float X0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected Float x0 = X0_EDEFAULT;

    /**
     * This is true if the X0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x0ESet;

    /**
     * The cached value of the '{@link #getToTransformerEnd() <em>To Transformer End</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToTransformerEnd()
     * @generated
     * @ordered
     */
    protected EList< TransformerEnd > toTransformerEnd;

    /**
     * The cached value of the '{@link #getFromTransformerEndInfo() <em>From Transformer End Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromTransformerEndInfo()
     * @generated
     * @ordered
     */
    protected TransformerEndInfo fromTransformerEndInfo;

    /**
     * This is true if the From Transformer End Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fromTransformerEndInfoESet;

    /**
     * The cached value of the '{@link #getFromTransformerEnd() <em>From Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromTransformerEnd()
     * @generated
     * @ordered
     */
    protected TransformerEnd fromTransformerEnd;

    /**
     * This is true if the From Transformer End reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fromTransformerEndESet;

    /**
     * The cached value of the '{@link #getToTransformerEndInfos() <em>To Transformer End Infos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToTransformerEndInfos()
     * @generated
     * @ordered
     */
    protected EList< TransformerEndInfo > toTransformerEndInfos;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformerMeshImpedanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTransformerMeshImpedance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Float newR ) {
        Float oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_MESH_IMPEDANCE__R, oldR, r, !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Float oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_MESH_IMPEDANCE__R, oldR, R_EDEFAULT, oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR0() {
        return r0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR0( Float newR0 ) {
        Float oldR0 = r0;
        r0 = newR0;
        boolean oldR0ESet = r0ESet;
        r0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_MESH_IMPEDANCE__R0, oldR0, r0, !oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR0() {
        Float oldR0 = r0;
        boolean oldR0ESet = r0ESet;
        r0 = R0_EDEFAULT;
        r0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_MESH_IMPEDANCE__R0, oldR0, R0_EDEFAULT, oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR0() {
        return r0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX( Float newX ) {
        Float oldX = x;
        x = newX;
        boolean oldXESet = xESet;
        xESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_MESH_IMPEDANCE__X, oldX, x, !oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX() {
        Float oldX = x;
        boolean oldXESet = xESet;
        x = X_EDEFAULT;
        xESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_MESH_IMPEDANCE__X, oldX, X_EDEFAULT, oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX() {
        return xESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX0() {
        return x0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX0( Float newX0 ) {
        Float oldX0 = x0;
        x0 = newX0;
        boolean oldX0ESet = x0ESet;
        x0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_MESH_IMPEDANCE__X0, oldX0, x0, !oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX0() {
        Float oldX0 = x0;
        boolean oldX0ESet = x0ESet;
        x0 = X0_EDEFAULT;
        x0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_MESH_IMPEDANCE__X0, oldX0, X0_EDEFAULT, oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX0() {
        return x0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerEnd > getToTransformerEnd() {
        if( toTransformerEnd == null ) {
            toTransformerEnd = new EObjectWithInverseEList.Unsettable.ManyInverse< TransformerEnd >(
                    TransformerEnd.class, this, CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END,
                    CimPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE );
        }
        return toTransformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetToTransformerEnd() {
        if( toTransformerEnd != null ) ( ( InternalEList.Unsettable< ? > ) toTransformerEnd ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetToTransformerEnd() {
        return toTransformerEnd != null && ( ( InternalEList.Unsettable< ? > ) toTransformerEnd ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEndInfo getFromTransformerEndInfo() {
        return fromTransformerEndInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFromTransformerEndInfo( TransformerEndInfo newFromTransformerEndInfo,
            NotificationChain msgs ) {
        TransformerEndInfo oldFromTransformerEndInfo = fromTransformerEndInfo;
        fromTransformerEndInfo = newFromTransformerEndInfo;
        boolean oldFromTransformerEndInfoESet = fromTransformerEndInfoESet;
        fromTransformerEndInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO, oldFromTransformerEndInfo,
                    newFromTransformerEndInfo, !oldFromTransformerEndInfoESet );
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
    public void setFromTransformerEndInfo( TransformerEndInfo newFromTransformerEndInfo ) {
        if( newFromTransformerEndInfo != fromTransformerEndInfo ) {
            NotificationChain msgs = null;
            if( fromTransformerEndInfo != null )
                msgs = ( ( InternalEObject ) fromTransformerEndInfo ).eInverseRemove( this,
                        CimPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCES, TransformerEndInfo.class, msgs );
            if( newFromTransformerEndInfo != null )
                msgs = ( ( InternalEObject ) newFromTransformerEndInfo ).eInverseAdd( this,
                        CimPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCES, TransformerEndInfo.class, msgs );
            msgs = basicSetFromTransformerEndInfo( newFromTransformerEndInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFromTransformerEndInfoESet = fromTransformerEndInfoESet;
            fromTransformerEndInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO, newFromTransformerEndInfo,
                    newFromTransformerEndInfo, !oldFromTransformerEndInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetFromTransformerEndInfo( NotificationChain msgs ) {
        TransformerEndInfo oldFromTransformerEndInfo = fromTransformerEndInfo;
        fromTransformerEndInfo = null;
        boolean oldFromTransformerEndInfoESet = fromTransformerEndInfoESet;
        fromTransformerEndInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO, oldFromTransformerEndInfo, null,
                    oldFromTransformerEndInfoESet );
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
    public void unsetFromTransformerEndInfo() {
        if( fromTransformerEndInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) fromTransformerEndInfo ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCES, TransformerEndInfo.class, msgs );
            msgs = basicUnsetFromTransformerEndInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFromTransformerEndInfoESet = fromTransformerEndInfoESet;
            fromTransformerEndInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO, null, null,
                    oldFromTransformerEndInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFromTransformerEndInfo() {
        return fromTransformerEndInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEnd getFromTransformerEnd() {
        return fromTransformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFromTransformerEnd( TransformerEnd newFromTransformerEnd,
            NotificationChain msgs ) {
        TransformerEnd oldFromTransformerEnd = fromTransformerEnd;
        fromTransformerEnd = newFromTransformerEnd;
        boolean oldFromTransformerEndESet = fromTransformerEndESet;
        fromTransformerEndESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END, oldFromTransformerEnd,
                    newFromTransformerEnd, !oldFromTransformerEndESet );
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
    public void setFromTransformerEnd( TransformerEnd newFromTransformerEnd ) {
        if( newFromTransformerEnd != fromTransformerEnd ) {
            NotificationChain msgs = null;
            if( fromTransformerEnd != null ) msgs = ( ( InternalEObject ) fromTransformerEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE, TransformerEnd.class, msgs );
            if( newFromTransformerEnd != null ) msgs = ( ( InternalEObject ) newFromTransformerEnd ).eInverseAdd( this,
                    CimPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE, TransformerEnd.class, msgs );
            msgs = basicSetFromTransformerEnd( newFromTransformerEnd, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFromTransformerEndESet = fromTransformerEndESet;
            fromTransformerEndESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END, newFromTransformerEnd,
                    newFromTransformerEnd, !oldFromTransformerEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetFromTransformerEnd( NotificationChain msgs ) {
        TransformerEnd oldFromTransformerEnd = fromTransformerEnd;
        fromTransformerEnd = null;
        boolean oldFromTransformerEndESet = fromTransformerEndESet;
        fromTransformerEndESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END, oldFromTransformerEnd, null,
                    oldFromTransformerEndESet );
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
    public void unsetFromTransformerEnd() {
        if( fromTransformerEnd != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) fromTransformerEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE, TransformerEnd.class, msgs );
            msgs = basicUnsetFromTransformerEnd( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFromTransformerEndESet = fromTransformerEndESet;
            fromTransformerEndESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END, null, null,
                    oldFromTransformerEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFromTransformerEnd() {
        return fromTransformerEndESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerEndInfo > getToTransformerEndInfos() {
        if( toTransformerEndInfos == null ) {
            toTransformerEndInfos = new EObjectWithInverseEList.Unsettable.ManyInverse< TransformerEndInfo >(
                    TransformerEndInfo.class, this, CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFOS,
                    CimPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCES );
        }
        return toTransformerEndInfos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetToTransformerEndInfos() {
        if( toTransformerEndInfos != null ) ( ( InternalEList.Unsettable< ? > ) toTransformerEndInfos ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetToTransformerEndInfos() {
        return toTransformerEndInfos != null && ( ( InternalEList.Unsettable< ? > ) toTransformerEndInfos ).isSet();
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
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getToTransformerEnd() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
            if( fromTransformerEndInfo != null )
                msgs = ( ( InternalEObject ) fromTransformerEndInfo ).eInverseRemove( this,
                        CimPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCES, TransformerEndInfo.class, msgs );
            return basicSetFromTransformerEndInfo( ( TransformerEndInfo ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
            if( fromTransformerEnd != null ) msgs = ( ( InternalEObject ) fromTransformerEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE, TransformerEnd.class, msgs );
            return basicSetFromTransformerEnd( ( TransformerEnd ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFOS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getToTransformerEndInfos() )
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
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
            return ( ( InternalEList< ? > ) getToTransformerEnd() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
            return basicUnsetFromTransformerEndInfo( msgs );
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
            return basicUnsetFromTransformerEnd( msgs );
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFOS:
            return ( ( InternalEList< ? > ) getToTransformerEndInfos() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__R:
            return getR();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__R0:
            return getR0();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__X:
            return getX();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__X0:
            return getX0();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
            return getToTransformerEnd();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
            return getFromTransformerEndInfo();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
            return getFromTransformerEnd();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFOS:
            return getToTransformerEndInfos();
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
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__R0:
            setR0( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__X:
            setX( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__X0:
            setX0( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
            getToTransformerEnd().clear();
            getToTransformerEnd().addAll( ( Collection< ? extends TransformerEnd > ) newValue );
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
            setFromTransformerEndInfo( ( TransformerEndInfo ) newValue );
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
            setFromTransformerEnd( ( TransformerEnd ) newValue );
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFOS:
            getToTransformerEndInfos().clear();
            getToTransformerEndInfos().addAll( ( Collection< ? extends TransformerEndInfo > ) newValue );
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
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__R:
            unsetR();
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__R0:
            unsetR0();
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__X:
            unsetX();
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__X0:
            unsetX0();
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
            unsetToTransformerEnd();
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
            unsetFromTransformerEndInfo();
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
            unsetFromTransformerEnd();
            return;
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFOS:
            unsetToTransformerEndInfos();
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
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__R:
            return isSetR();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__R0:
            return isSetR0();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__X:
            return isSetX();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__X0:
            return isSetX0();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
            return isSetToTransformerEnd();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
            return isSetFromTransformerEndInfo();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
            return isSetFromTransformerEnd();
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFOS:
            return isSetToTransformerEndInfos();
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
        result.append( " (r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TransformerMeshImpedanceImpl
