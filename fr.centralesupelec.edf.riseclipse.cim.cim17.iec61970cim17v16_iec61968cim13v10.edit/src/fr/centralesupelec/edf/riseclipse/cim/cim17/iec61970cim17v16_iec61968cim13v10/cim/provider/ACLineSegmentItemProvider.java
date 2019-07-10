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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACLineSegment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACLineSegment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ACLineSegmentItemProvider extends ConductorItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ACLineSegmentItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addB0chPropertyDescriptor( object );
            addBchPropertyDescriptor( object );
            addG0chPropertyDescriptor( object );
            addGchPropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addR0PropertyDescriptor( object );
            addShortCircuitEndTemperaturePropertyDescriptor( object );
            addXPropertyDescriptor( object );
            addX0PropertyDescriptor( object );
            addLineFaultsPropertyDescriptor( object );
            addClampPropertyDescriptor( object );
            addPerLengthImpedancePropertyDescriptor( object );
            addLineGroundingActionPropertyDescriptor( object );
            addCutPropertyDescriptor( object );
            addLineJumpingActionPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the B0ch feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addB0chPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_b0ch_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_b0ch_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_B0ch(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bch feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBchPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_bch_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_bch_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_Bch(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the G0ch feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addG0chPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_g0ch_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_g0ch_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_G0ch(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gch feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGchPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_gch_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_gch_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_Gch(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_r_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_R(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_r0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_r0_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_R0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Short Circuit End Temperature feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShortCircuitEndTemperaturePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ACLineSegment_shortCircuitEndTemperature_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_shortCircuitEndTemperature_feature",
                        "_UI_ACLineSegment_type" ),
                CimPackage.eINSTANCE.getACLineSegment_ShortCircuitEndTemperature(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_x_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_x_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_X(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_x0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_x0_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_X0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Line Faults feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLineFaultsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_LineFaults_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_LineFaults_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_LineFaults(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Clamp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClampPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_Clamp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_Clamp_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_Clamp(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Per Length Impedance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPerLengthImpedancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_PerLengthImpedance_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_PerLengthImpedance_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_PerLengthImpedance(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Line Grounding Action feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLineGroundingActionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ACLineSegment_LineGroundingAction_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_LineGroundingAction_feature",
                        "_UI_ACLineSegment_type" ),
                CimPackage.eINSTANCE.getACLineSegment_LineGroundingAction(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cut feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCutPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_Cut_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_Cut_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_Cut(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Line Jumping Action feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLineJumpingActionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACLineSegment_LineJumpingAction_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACLineSegment_LineJumpingAction_feature",
                                "_UI_ACLineSegment_type" ),
                        CimPackage.eINSTANCE.getACLineSegment_LineJumpingAction(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns ACLineSegment.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ACLineSegment" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ACLineSegment ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ACLineSegment_type" )
                : getString( "_UI_ACLineSegment_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( ACLineSegment.class ) ) {
        case CimPackage.AC_LINE_SEGMENT__B0CH:
        case CimPackage.AC_LINE_SEGMENT__BCH:
        case CimPackage.AC_LINE_SEGMENT__G0CH:
        case CimPackage.AC_LINE_SEGMENT__GCH:
        case CimPackage.AC_LINE_SEGMENT__R:
        case CimPackage.AC_LINE_SEGMENT__R0:
        case CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE:
        case CimPackage.AC_LINE_SEGMENT__X:
        case CimPackage.AC_LINE_SEGMENT__X0:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
