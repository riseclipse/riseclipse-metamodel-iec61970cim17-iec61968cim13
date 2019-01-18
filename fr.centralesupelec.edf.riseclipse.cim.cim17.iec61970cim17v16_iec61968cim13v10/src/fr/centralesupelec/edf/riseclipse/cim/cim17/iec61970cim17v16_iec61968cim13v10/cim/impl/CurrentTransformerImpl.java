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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentTransformerImpl#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentTransformerImpl#getAccuracyLimit <em>Accuracy Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentTransformerImpl#getCoreBurden <em>Core Burden</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentTransformerImpl#getCtClass <em>Ct Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurrentTransformerImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentTransformerImpl extends SensorImpl implements CurrentTransformer {
    /**
     * The default value of the '{@link #getAccuracyClass() <em>Accuracy Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccuracyClass()
     * @generated
     * @ordered
     */
    protected static final String ACCURACY_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccuracyClass() <em>Accuracy Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccuracyClass()
     * @generated
     * @ordered
     */
    protected String accuracyClass = ACCURACY_CLASS_EDEFAULT;

    /**
     * This is true if the Accuracy Class attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accuracyClassESet;

    /**
     * The default value of the '{@link #getAccuracyLimit() <em>Accuracy Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccuracyLimit()
     * @generated
     * @ordered
     */
    protected static final Float ACCURACY_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccuracyLimit() <em>Accuracy Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccuracyLimit()
     * @generated
     * @ordered
     */
    protected Float accuracyLimit = ACCURACY_LIMIT_EDEFAULT;

    /**
     * This is true if the Accuracy Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accuracyLimitESet;

    /**
     * The default value of the '{@link #getCoreBurden() <em>Core Burden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreBurden()
     * @generated
     * @ordered
     */
    protected static final Float CORE_BURDEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCoreBurden() <em>Core Burden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreBurden()
     * @generated
     * @ordered
     */
    protected Float coreBurden = CORE_BURDEN_EDEFAULT;

    /**
     * This is true if the Core Burden attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coreBurdenESet;

    /**
     * The default value of the '{@link #getCtClass() <em>Ct Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCtClass()
     * @generated
     * @ordered
     */
    protected static final String CT_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCtClass() <em>Ct Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCtClass()
     * @generated
     * @ordered
     */
    protected String ctClass = CT_CLASS_EDEFAULT;

    /**
     * This is true if the Ct Class attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ctClassESet;

    /**
     * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsage()
     * @generated
     * @ordered
     */
    protected static final String USAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsage()
     * @generated
     * @ordered
     */
    protected String usage = USAGE_EDEFAULT;

    /**
     * This is true if the Usage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usageESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CurrentTransformerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCurrentTransformer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAccuracyClass() {
        return accuracyClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccuracyClass( String newAccuracyClass ) {
        String oldAccuracyClass = accuracyClass;
        accuracyClass = newAccuracyClass;
        boolean oldAccuracyClassESet = accuracyClassESet;
        accuracyClassESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS,
                    oldAccuracyClass, accuracyClass, !oldAccuracyClassESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccuracyClass() {
        String oldAccuracyClass = accuracyClass;
        boolean oldAccuracyClassESet = accuracyClassESet;
        accuracyClass = ACCURACY_CLASS_EDEFAULT;
        accuracyClassESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS,
                    oldAccuracyClass, ACCURACY_CLASS_EDEFAULT, oldAccuracyClassESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccuracyClass() {
        return accuracyClassESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAccuracyLimit() {
        return accuracyLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccuracyLimit( Float newAccuracyLimit ) {
        Float oldAccuracyLimit = accuracyLimit;
        accuracyLimit = newAccuracyLimit;
        boolean oldAccuracyLimitESet = accuracyLimitESet;
        accuracyLimitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT,
                    oldAccuracyLimit, accuracyLimit, !oldAccuracyLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccuracyLimit() {
        Float oldAccuracyLimit = accuracyLimit;
        boolean oldAccuracyLimitESet = accuracyLimitESet;
        accuracyLimit = ACCURACY_LIMIT_EDEFAULT;
        accuracyLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT,
                    oldAccuracyLimit, ACCURACY_LIMIT_EDEFAULT, oldAccuracyLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccuracyLimit() {
        return accuracyLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCoreBurden() {
        return coreBurden;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoreBurden( Float newCoreBurden ) {
        Float oldCoreBurden = coreBurden;
        coreBurden = newCoreBurden;
        boolean oldCoreBurdenESet = coreBurdenESet;
        coreBurdenESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURRENT_TRANSFORMER__CORE_BURDEN, oldCoreBurden, coreBurden, !oldCoreBurdenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoreBurden() {
        Float oldCoreBurden = coreBurden;
        boolean oldCoreBurdenESet = coreBurdenESet;
        coreBurden = CORE_BURDEN_EDEFAULT;
        coreBurdenESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CURRENT_TRANSFORMER__CORE_BURDEN, oldCoreBurden, CORE_BURDEN_EDEFAULT, oldCoreBurdenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoreBurden() {
        return coreBurdenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCtClass() {
        return ctClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCtClass( String newCtClass ) {
        String oldCtClass = ctClass;
        ctClass = newCtClass;
        boolean oldCtClassESet = ctClassESet;
        ctClassESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURRENT_TRANSFORMER__CT_CLASS, oldCtClass, ctClass, !oldCtClassESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCtClass() {
        String oldCtClass = ctClass;
        boolean oldCtClassESet = ctClassESet;
        ctClass = CT_CLASS_EDEFAULT;
        ctClassESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CURRENT_TRANSFORMER__CT_CLASS, oldCtClass, CT_CLASS_EDEFAULT, oldCtClassESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCtClass() {
        return ctClassESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUsage() {
        return usage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUsage( String newUsage ) {
        String oldUsage = usage;
        usage = newUsage;
        boolean oldUsageESet = usageESet;
        usageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURRENT_TRANSFORMER__USAGE, oldUsage, usage, !oldUsageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsage() {
        String oldUsage = usage;
        boolean oldUsageESet = usageESet;
        usage = USAGE_EDEFAULT;
        usageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CURRENT_TRANSFORMER__USAGE, oldUsage, USAGE_EDEFAULT, oldUsageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsage() {
        return usageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
            return getAccuracyClass();
        case CimPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
            return getAccuracyLimit();
        case CimPackage.CURRENT_TRANSFORMER__CORE_BURDEN:
            return getCoreBurden();
        case CimPackage.CURRENT_TRANSFORMER__CT_CLASS:
            return getCtClass();
        case CimPackage.CURRENT_TRANSFORMER__USAGE:
            return getUsage();
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
        case CimPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
            setAccuracyClass( ( String ) newValue );
            return;
        case CimPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
            setAccuracyLimit( ( Float ) newValue );
            return;
        case CimPackage.CURRENT_TRANSFORMER__CORE_BURDEN:
            setCoreBurden( ( Float ) newValue );
            return;
        case CimPackage.CURRENT_TRANSFORMER__CT_CLASS:
            setCtClass( ( String ) newValue );
            return;
        case CimPackage.CURRENT_TRANSFORMER__USAGE:
            setUsage( ( String ) newValue );
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
        case CimPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
            unsetAccuracyClass();
            return;
        case CimPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
            unsetAccuracyLimit();
            return;
        case CimPackage.CURRENT_TRANSFORMER__CORE_BURDEN:
            unsetCoreBurden();
            return;
        case CimPackage.CURRENT_TRANSFORMER__CT_CLASS:
            unsetCtClass();
            return;
        case CimPackage.CURRENT_TRANSFORMER__USAGE:
            unsetUsage();
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
        case CimPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
            return isSetAccuracyClass();
        case CimPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
            return isSetAccuracyLimit();
        case CimPackage.CURRENT_TRANSFORMER__CORE_BURDEN:
            return isSetCoreBurden();
        case CimPackage.CURRENT_TRANSFORMER__CT_CLASS:
            return isSetCtClass();
        case CimPackage.CURRENT_TRANSFORMER__USAGE:
            return isSetUsage();
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
        result.append( " (accuracyClass: " );
        if( accuracyClassESet )
            result.append( accuracyClass );
        else
            result.append( "<unset>" );
        result.append( ", accuracyLimit: " );
        if( accuracyLimitESet )
            result.append( accuracyLimit );
        else
            result.append( "<unset>" );
        result.append( ", coreBurden: " );
        if( coreBurdenESet )
            result.append( coreBurden );
        else
            result.append( "<unset>" );
        result.append( ", ctClass: " );
        if( ctClassESet )
            result.append( ctClass );
        else
            result.append( "<unset>" );
        result.append( ", usage: " );
        if( usageESet )
            result.append( usage );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CurrentTransformerImpl
