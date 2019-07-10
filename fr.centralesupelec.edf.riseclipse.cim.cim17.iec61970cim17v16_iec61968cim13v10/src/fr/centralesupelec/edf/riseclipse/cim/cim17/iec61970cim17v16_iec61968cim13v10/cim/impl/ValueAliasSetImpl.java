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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Command;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RaiseLowerCommand;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ValueAliasSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ValueToAlias;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Alias Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ValueAliasSetImpl#getRaiseLowerCommands <em>Raise Lower Commands</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ValueAliasSetImpl#getDiscretes <em>Discretes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ValueAliasSetImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ValueAliasSetImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueAliasSetImpl extends IdentifiedObjectImpl implements ValueAliasSet {
    /**
     * The cached value of the '{@link #getRaiseLowerCommands() <em>Raise Lower Commands</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRaiseLowerCommands()
     * @generated
     * @ordered
     */
    protected EList< RaiseLowerCommand > raiseLowerCommands;

    /**
     * The cached value of the '{@link #getDiscretes() <em>Discretes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiscretes()
     * @generated
     * @ordered
     */
    protected EList< Discrete > discretes;

    /**
     * The cached value of the '{@link #getCommands() <em>Commands</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommands()
     * @generated
     * @ordered
     */
    protected EList< Command > commands;

    /**
     * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValues()
     * @generated
     * @ordered
     */
    protected EList< ValueToAlias > values;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValueAliasSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getValueAliasSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RaiseLowerCommand > getRaiseLowerCommands() {
        if( raiseLowerCommands == null ) {
            raiseLowerCommands = new EObjectWithInverseResolvingEList.Unsettable< RaiseLowerCommand >(
                    RaiseLowerCommand.class, this, CimPackage.VALUE_ALIAS_SET__RAISE_LOWER_COMMANDS,
                    CimPackage.RAISE_LOWER_COMMAND__VALUE_ALIAS_SET );
        }
        return raiseLowerCommands;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRaiseLowerCommands() {
        if( raiseLowerCommands != null ) ( ( InternalEList.Unsettable< ? > ) raiseLowerCommands ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRaiseLowerCommands() {
        return raiseLowerCommands != null && ( ( InternalEList.Unsettable< ? > ) raiseLowerCommands ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Discrete > getDiscretes() {
        if( discretes == null ) {
            discretes = new EObjectWithInverseResolvingEList.Unsettable< Discrete >( Discrete.class, this,
                    CimPackage.VALUE_ALIAS_SET__DISCRETES, CimPackage.DISCRETE__VALUE_ALIAS_SET );
        }
        return discretes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiscretes() {
        if( discretes != null ) ( ( InternalEList.Unsettable< ? > ) discretes ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiscretes() {
        return discretes != null && ( ( InternalEList.Unsettable< ? > ) discretes ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Command > getCommands() {
        if( commands == null ) {
            commands = new EObjectWithInverseResolvingEList.Unsettable< Command >( Command.class, this,
                    CimPackage.VALUE_ALIAS_SET__COMMANDS, CimPackage.COMMAND__VALUE_ALIAS_SET );
        }
        return commands;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCommands() {
        if( commands != null ) ( ( InternalEList.Unsettable< ? > ) commands ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCommands() {
        return commands != null && ( ( InternalEList.Unsettable< ? > ) commands ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ValueToAlias > getValues() {
        if( values == null ) {
            values = new EObjectWithInverseResolvingEList.Unsettable< ValueToAlias >( ValueToAlias.class, this,
                    CimPackage.VALUE_ALIAS_SET__VALUES, CimPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET );
        }
        return values;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValues() {
        if( values != null ) ( ( InternalEList.Unsettable< ? > ) values ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValues() {
        return values != null && ( ( InternalEList.Unsettable< ? > ) values ).isSet();
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
        case CimPackage.VALUE_ALIAS_SET__RAISE_LOWER_COMMANDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRaiseLowerCommands() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.VALUE_ALIAS_SET__DISCRETES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDiscretes() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.VALUE_ALIAS_SET__COMMANDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCommands() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.VALUE_ALIAS_SET__VALUES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getValues() ).basicAdd( otherEnd,
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
        case CimPackage.VALUE_ALIAS_SET__RAISE_LOWER_COMMANDS:
            return ( ( InternalEList< ? > ) getRaiseLowerCommands() ).basicRemove( otherEnd, msgs );
        case CimPackage.VALUE_ALIAS_SET__DISCRETES:
            return ( ( InternalEList< ? > ) getDiscretes() ).basicRemove( otherEnd, msgs );
        case CimPackage.VALUE_ALIAS_SET__COMMANDS:
            return ( ( InternalEList< ? > ) getCommands() ).basicRemove( otherEnd, msgs );
        case CimPackage.VALUE_ALIAS_SET__VALUES:
            return ( ( InternalEList< ? > ) getValues() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.VALUE_ALIAS_SET__RAISE_LOWER_COMMANDS:
            return getRaiseLowerCommands();
        case CimPackage.VALUE_ALIAS_SET__DISCRETES:
            return getDiscretes();
        case CimPackage.VALUE_ALIAS_SET__COMMANDS:
            return getCommands();
        case CimPackage.VALUE_ALIAS_SET__VALUES:
            return getValues();
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
        case CimPackage.VALUE_ALIAS_SET__RAISE_LOWER_COMMANDS:
            getRaiseLowerCommands().clear();
            getRaiseLowerCommands().addAll( ( Collection< ? extends RaiseLowerCommand > ) newValue );
            return;
        case CimPackage.VALUE_ALIAS_SET__DISCRETES:
            getDiscretes().clear();
            getDiscretes().addAll( ( Collection< ? extends Discrete > ) newValue );
            return;
        case CimPackage.VALUE_ALIAS_SET__COMMANDS:
            getCommands().clear();
            getCommands().addAll( ( Collection< ? extends Command > ) newValue );
            return;
        case CimPackage.VALUE_ALIAS_SET__VALUES:
            getValues().clear();
            getValues().addAll( ( Collection< ? extends ValueToAlias > ) newValue );
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
        case CimPackage.VALUE_ALIAS_SET__RAISE_LOWER_COMMANDS:
            unsetRaiseLowerCommands();
            return;
        case CimPackage.VALUE_ALIAS_SET__DISCRETES:
            unsetDiscretes();
            return;
        case CimPackage.VALUE_ALIAS_SET__COMMANDS:
            unsetCommands();
            return;
        case CimPackage.VALUE_ALIAS_SET__VALUES:
            unsetValues();
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
        case CimPackage.VALUE_ALIAS_SET__RAISE_LOWER_COMMANDS:
            return isSetRaiseLowerCommands();
        case CimPackage.VALUE_ALIAS_SET__DISCRETES:
            return isSetDiscretes();
        case CimPackage.VALUE_ALIAS_SET__COMMANDS:
            return isSetCommands();
        case CimPackage.VALUE_ALIAS_SET__VALUES:
            return isSetValues();
        }
        return super.eIsSet( featureID );
    }

} //ValueAliasSetImpl
