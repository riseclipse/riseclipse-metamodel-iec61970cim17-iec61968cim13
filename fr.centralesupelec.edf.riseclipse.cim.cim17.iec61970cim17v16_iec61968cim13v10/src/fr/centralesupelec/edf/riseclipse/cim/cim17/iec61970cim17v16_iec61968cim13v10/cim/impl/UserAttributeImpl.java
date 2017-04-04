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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StringQuantity;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UserAttribute;

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
 * An implementation of the model object '<em><b>User Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UserAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UserAttributeImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UserAttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UserAttributeImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UserAttributeImpl#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserAttributeImpl extends CimObjectWithIDImpl implements UserAttribute {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

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
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected StringQuantity value;

    /**
     * This is true if the Value containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

    /**
     * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransaction()
     * @generated
     * @ordered
     */
    protected Transaction transaction;

    /**
     * This is true if the Transaction reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transactionESet;

    /**
     * The cached value of the '{@link #getProcedureDataSets() <em>Procedure Data Sets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcedureDataSets()
     * @generated
     * @ordered
     */
    protected EList< ProcedureDataSet > procedureDataSets;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UserAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getUserAttribute();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USER_ATTRIBUTE__NAME, oldName, name, !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USER_ATTRIBUTE__NAME, oldName, NAME_EDEFAULT, oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER,
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
    public StringQuantity getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValue( StringQuantity newValue, NotificationChain msgs ) {
        StringQuantity oldValue = value;
        value = newValue;
        boolean oldValueESet = valueESet;
        valueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.USER_ATTRIBUTE__VALUE, oldValue, newValue, !oldValueESet );
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
    public void setValue( StringQuantity newValue ) {
        if( newValue != value ) {
            NotificationChain msgs = null;
            if( value != null ) msgs = ( ( InternalEObject ) value ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.USER_ATTRIBUTE__VALUE, null, msgs );
            if( newValue != null ) msgs = ( ( InternalEObject ) newValue ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.USER_ATTRIBUTE__VALUE, null, msgs );
            msgs = basicSetValue( newValue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueESet = valueESet;
            valueESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.USER_ATTRIBUTE__VALUE, newValue, newValue, !oldValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetValue( NotificationChain msgs ) {
        StringQuantity oldValue = value;
        value = null;
        boolean oldValueESet = valueESet;
        valueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USER_ATTRIBUTE__VALUE, oldValue, null, oldValueESet );
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
    public void unsetValue() {
        if( value != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) value ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.USER_ATTRIBUTE__VALUE, null, msgs );
            msgs = basicUnsetValue( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueESet = valueESet;
            valueESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USER_ATTRIBUTE__VALUE, null, null, oldValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue() {
        return valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransaction( Transaction newTransaction, NotificationChain msgs ) {
        Transaction oldTransaction = transaction;
        transaction = newTransaction;
        boolean oldTransactionESet = transactionESet;
        transactionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.USER_ATTRIBUTE__TRANSACTION, oldTransaction, newTransaction, !oldTransactionESet );
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
    public void setTransaction( Transaction newTransaction ) {
        if( newTransaction != transaction ) {
            NotificationChain msgs = null;
            if( transaction != null ) msgs = ( ( InternalEObject ) transaction ).eInverseRemove( this,
                    CimPackage.TRANSACTION__USER_ATTRIBUTES, Transaction.class, msgs );
            if( newTransaction != null ) msgs = ( ( InternalEObject ) newTransaction ).eInverseAdd( this,
                    CimPackage.TRANSACTION__USER_ATTRIBUTES, Transaction.class, msgs );
            msgs = basicSetTransaction( newTransaction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransactionESet = transactionESet;
            transactionESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.USER_ATTRIBUTE__TRANSACTION, newTransaction, newTransaction, !oldTransactionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTransaction( NotificationChain msgs ) {
        Transaction oldTransaction = transaction;
        transaction = null;
        boolean oldTransactionESet = transactionESet;
        transactionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USER_ATTRIBUTE__TRANSACTION, oldTransaction, null, oldTransactionESet );
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
    public void unsetTransaction() {
        if( transaction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) transaction ).eInverseRemove( this, CimPackage.TRANSACTION__USER_ATTRIBUTES,
                    Transaction.class, msgs );
            msgs = basicUnsetTransaction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransactionESet = transactionESet;
            transactionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USER_ATTRIBUTE__TRANSACTION, null, null, oldTransactionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransaction() {
        return transactionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProcedureDataSet > getProcedureDataSets() {
        if( procedureDataSets == null ) {
            procedureDataSets = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< ProcedureDataSet >(
                    ProcedureDataSet.class, this, CimPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS,
                    CimPackage.PROCEDURE_DATA_SET__PROPERTIES );
        }
        return procedureDataSets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProcedureDataSets() {
        if( procedureDataSets != null ) ( ( InternalEList.Unsettable< ? > ) procedureDataSets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcedureDataSets() {
        return procedureDataSets != null && ( ( InternalEList.Unsettable< ? > ) procedureDataSets ).isSet();
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
        case CimPackage.USER_ATTRIBUTE__TRANSACTION:
            if( transaction != null ) msgs = ( ( InternalEObject ) transaction ).eInverseRemove( this,
                    CimPackage.TRANSACTION__USER_ATTRIBUTES, Transaction.class, msgs );
            return basicSetTransaction( ( Transaction ) otherEnd, msgs );
        case CimPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProcedureDataSets() )
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
        case CimPackage.USER_ATTRIBUTE__VALUE:
            return basicUnsetValue( msgs );
        case CimPackage.USER_ATTRIBUTE__TRANSACTION:
            return basicUnsetTransaction( msgs );
        case CimPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
            return ( ( InternalEList< ? > ) getProcedureDataSets() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.USER_ATTRIBUTE__NAME:
            return getName();
        case CimPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
            return getSequenceNumber();
        case CimPackage.USER_ATTRIBUTE__VALUE:
            return getValue();
        case CimPackage.USER_ATTRIBUTE__TRANSACTION:
            return getTransaction();
        case CimPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
            return getProcedureDataSets();
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
        case CimPackage.USER_ATTRIBUTE__NAME:
            setName( ( String ) newValue );
            return;
        case CimPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
            setSequenceNumber( ( Integer ) newValue );
            return;
        case CimPackage.USER_ATTRIBUTE__VALUE:
            setValue( ( StringQuantity ) newValue );
            return;
        case CimPackage.USER_ATTRIBUTE__TRANSACTION:
            setTransaction( ( Transaction ) newValue );
            return;
        case CimPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
            getProcedureDataSets().clear();
            getProcedureDataSets().addAll( ( Collection< ? extends ProcedureDataSet > ) newValue );
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
        case CimPackage.USER_ATTRIBUTE__NAME:
            unsetName();
            return;
        case CimPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
            unsetSequenceNumber();
            return;
        case CimPackage.USER_ATTRIBUTE__VALUE:
            unsetValue();
            return;
        case CimPackage.USER_ATTRIBUTE__TRANSACTION:
            unsetTransaction();
            return;
        case CimPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
            unsetProcedureDataSets();
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
        case CimPackage.USER_ATTRIBUTE__NAME:
            return isSetName();
        case CimPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
            return isSetSequenceNumber();
        case CimPackage.USER_ATTRIBUTE__VALUE:
            return isSetValue();
        case CimPackage.USER_ATTRIBUTE__TRANSACTION:
            return isSetTransaction();
        case CimPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
            return isSetProcedureDataSets();
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
        result.append( " (name: " );
        if( nameESet )
            result.append( name );
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

} //UserAttributeImpl
