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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscExcContIEEEDEC1AItemProvider extends DiscontinuousExcitationControlDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiscExcContIEEEDEC1AItemProvider( AdapterFactory adapterFactory ) {
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

            addEscPropertyDescriptor( object );
            addKanPropertyDescriptor( object );
            addKetlPropertyDescriptor( object );
            addTanPropertyDescriptor( object );
            addTdPropertyDescriptor( object );
            addTl1PropertyDescriptor( object );
            addTl2PropertyDescriptor( object );
            addTw5PropertyDescriptor( object );
            addValPropertyDescriptor( object );
            addVanmaxPropertyDescriptor( object );
            addVomaxPropertyDescriptor( object );
            addVominPropertyDescriptor( object );
            addVsmaxPropertyDescriptor( object );
            addVsminPropertyDescriptor( object );
            addVtcPropertyDescriptor( object );
            addVtlmtPropertyDescriptor( object );
            addVtmPropertyDescriptor( object );
            addVtnPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Esc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEscPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_esc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_esc_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Esc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kan feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKanPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_kan_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_kan_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Kan(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ketl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKetlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_ketl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_ketl_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Ketl(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tan feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTanPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_tan_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_tan_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Tan(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Td feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_td_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_td_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Td(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tl1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_tl1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_tl1_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Tl1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tl2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTl2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_tl2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_tl2_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Tl2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tw5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTw5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_tw5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_tw5_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Tw5(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Val feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_val_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_val_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Val(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vanmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVanmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_vanmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_vanmax_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Vanmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vomax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVomaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_vomax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_vomax_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Vomax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vomin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVominPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_vomin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_vomin_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Vomin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vsmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVsmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_vsmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_vsmax_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Vsmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vsmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVsminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_vsmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_vsmin_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Vsmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vtc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVtcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_vtc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_vtc_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Vtc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vtlmt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVtlmtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_vtlmt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_vtlmt_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Vtlmt(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vtm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVtmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_vtm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_vtm_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Vtm(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vtn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVtnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiscExcContIEEEDEC1A_vtn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiscExcContIEEEDEC1A_vtn_feature",
                                "_UI_DiscExcContIEEEDEC1A_type" ),
                        CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A_Vtn(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns DiscExcContIEEEDEC1A.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/DiscExcContIEEEDEC1A" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( DiscExcContIEEEDEC1A ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_DiscExcContIEEEDEC1A_type" )
                : getString( "_UI_DiscExcContIEEEDEC1A_type" ) + " " + label;
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

        switch( notification.getFeatureID( DiscExcContIEEEDEC1A.class ) ) {
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM:
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN:
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
